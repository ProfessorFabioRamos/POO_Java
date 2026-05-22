import java.util.Scanner;

public class SistemaCaixaEletronico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Neymar Junior", 50.0);

        System.out.println("--- Bem vindo ao banco Master ---");

        try{
            //Operação 1: Sucesso
            conta.depositar(200.0);
            System.out.println("Saldo atual: R$"+conta.verificarSaldo());
            //Operação 2: Saldo Insuficiente
            System.out.print("Quanto deseja sacar? R$");
            double valorSaque = scanner.nextDouble(); // Valor maior do que o saldo
            conta.sacar(valorSaque);

            //Operação 3: Deposito negativo
            System.out.print("Quanto deseja depositar? R$");
            double valorDeposito = scanner.nextDouble(); // Valor menor ou igual a zero
            conta.depositar(valorDeposito);
        }catch(SaldoInsuficienteException e){
            System.out.println("Erro de saldo!: "+e.getMessage());
        }catch(ValorInvalidoException e){
            System.out.println("Erro de valor!: "+e.getMessage());
        }finally{
            System.out.println("Encerrando operações.");
            scanner.close();
        }
    }
}
