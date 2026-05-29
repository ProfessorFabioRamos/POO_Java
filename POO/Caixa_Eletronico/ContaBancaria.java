import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;

public class ContaBancaria {
    private String titular;
    private double saldo;

    private static final Logger logger = Logger.getLogger(ContaBancaria.class.getName());
    static{
        try{
            // Cria o FileHandler, o parametro true ativa o modo append(adicionar no final do arquivo)
            FileHandler fileHandler = new FileHandler("logs_caixa_eletronico.txt", true);
            // Formato de texto simplificado
            fileHandler.setFormatter(new SimpleFormatter());
            // Adiciona manipulador de arquivo no logger
            logger.addHandler(fileHandler);
            // opcional: define o nivel de log que será escrito (info, warning, severe)
            logger.setLevel(Level.INFO);
        }catch(IOException e){
            System.err.println("Não foi possível criar o arquivo de log: "+e.getMessage());
        }
    }

    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
        logger.info("Conta criada para "+titular+"com saldo de R$ "+saldoInicial);
    }

    public double verificarSaldo(){
        return saldo;
    }

    public void depositar(double valor) throws ValorInvalidoException{
        logger.info("Iniciando operação de depósito. Valor: R$"+valor);

        if(valor <= 0){
            // Fazemos o log warning e disparamos o erro
            logger.warning("Falha no depósito: Tentativa de depositar valor negativo ou zero.Titular: "+titular);
            throw new ValorInvalidoException("O valor de depósito deve ser maior que zero!");
        }
        saldo += valor;
        logger.info("Depósito realizado com sucesso. Novo saldo: R$"+saldo);
    }

    public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException{
        logger.info("Iniciando operação de saque. Valor: R$"+valor);

        if(valor <= 0){
            logger.warning("Falha no saque: Tentativa de sacar valor negativo ou zero. Titular: "+titular);
            throw new ValorInvalidoException("O valor do saque deve ser maior que zero!");
        }
        
        if(valor > saldo){
            //Erro severo
            logger.severe("Falha crítica: Saque negado. Saldo: R$"+saldo+"| Tentativa: R$"+valor+"| Titular: "+titular);
            throw new SaldoInsuficienteException("Você não tem limite para este saque! Saldo atual: R$"+saldo);
        }
        saldo -= valor;
        logger.info("Saque de R$"+valor+" realizado com sucesso.");
    }
}
