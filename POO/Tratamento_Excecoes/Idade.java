import java.util.InputMismatchException;
import java.util.Scanner;

public class Idade {
    public int anoNascimento;
    public int anoAtual;

    public Idade(int anoAtual){
        this.anoAtual = anoAtual;
    }

    public void calcularIdade(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Digite o ano de nascimento: ");
            anoNascimento = scanner.nextInt();
            int idade = anoAtual - anoNascimento;
            System.out.println(String.format("Em %d você terá %d anos", anoAtual, idade));
        }catch (InputMismatchException e){
            System.out.println("Erro de entrada, você deve digitar apenas números");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Erro inesperado: "+e.getMessage());
        }
        scanner.close();
    }
}
