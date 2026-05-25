import java.util.Scanner;

public class SistemaCaixaEletronico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Neymar Junior", 50);

        System.out.println("\n-- Bem-vindo ao Banco Master --");

        try{
            // Operação 1: Sucesso de depósito
            conta.depositar(200.00);
            System.out.println("Saldo atual:R$"+conta.verificarSaldo());

            // Operação 2: Sucesso de depósito
            conta.sacar(20.00);
            System.out.println("Saldo atual:R$"+conta.verificarSaldo());
        }catch(ValorInvalidoException e){

        }
        catch(SaldoInsuficienteException e){

        }
    }
}
