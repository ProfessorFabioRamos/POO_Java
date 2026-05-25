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

            // Operação 3: Vai gerar ValorInvalidoException com deposito
            System.out.print("\nQuanto deseja depositar? R$ ");
            double valorDeposito = scanner.nextDouble(); // Digitar valor menor que zero ou zero
            conta.depositar(valorDeposito);

            // Operação 4: Vai gerar ValorInvalidoException com saque
            System.out.print("\nQuanto deseja sacar? R$ ");
            double valorSaque = scanner.nextDouble(); // Digitar valor menor que zero ou zero
            conta.sacar(valorSaque);
            
            // Operação 5: Vai gerar SaldoInsuficienteException com saque
            System.out.print("\nQuanto deseja sacar? R$ ");
            valorSaque = scanner.nextDouble(); // Digitar valor maior que o saldo
            conta.sacar(valorSaque);

            System.out.println("Por favor, retire seu dinheiro.");
            
        }catch(SaldoInsuficienteException e){
            System.out.println("\n[ERRO DE NEGÓCIO]: " + e.getMessage());
            System.out.println("Gostaria de fazer um empréstimo?"); // Ação amigável após o erro
        }catch(ValorInvalidoException e){
            System.out.println("\n[ERRO DE VALIDAÇÂO]: " + e.getMessage());
        }
        catch (Exception e) {
            // Erros não mapeados (como digitar uma letra no valor do saque)
            System.out.println("\n[ERRO DO SISTEMA]: Ocorreu um problema inesperado. Contate o gerente.");
        } finally {
            System.out.println("\n----------------------------------------");
            System.out.println("Encerrando a sessão de " + conta.verificarSaldo() + " reais.");
            System.out.println("Obrigado por utilizar nosso banco!");
            scanner.close();
        }
    }
}
