import java.util.logging.Logger;
import java.util.logging.Level;

public class ContaBancaria {
    private String titular;
    private double saldo;

    private static final Logger logger = Logger.getLogger(ContaBancaria.class.getName());

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
            logger.warning("Falha no depósito: Tentativa de depositar valor negativo ou zero.");
            throw new ValorInvalidoException("O valor de depósito deve ser maior que zero!");
        }
        saldo += valor;
        logger.info("Depósito realizado com sucesso. Novo saldo: R$"+saldo);
    }
}
