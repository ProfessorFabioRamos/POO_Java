import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        // String fruta = "";

        // Scanner sc = new Scanner(System.in, "UTF-8");
        // System.out.print("Digite o nome de uma fruta: ");
        // fruta = sc.nextLine();
        // fruta = fruta.toLowerCase();
        // sc.close();
        
        // switch (fruta) {
        //     //case "banana" -> System.out.println("Amarelo");
        //     case "banana":
        //         System.out.println("Vermelho");
        //         break;
        //     case "maça":
        //         System.out.println("Vermelho");
        //         break;
        //     case "abacate":
        //         System.out.println("Verde");
        //         break;
        //     case "açai":
        //         System.out.println("Roxo");
        //         break;
        //     default:
        //         System.out.println("Cor inválida");
        //         break;
        // }

        //int i = 0;
        // for(int i = 100; i >= 0; i-=2){
        //     System.out.println(i);
        // }
        // System.out.println("Fim.");

        Scanner sc = new Scanner(System.in);
        float somatorio = 0;
        int repeticoes = 10;

        for(int i = 0; i < repeticoes; i++){
            System.out.print("Digite o numero "+(i+1)+": ");
            float num = sc.nextFloat();
            somatorio += num;
        }
        System.out.print("Somatório: "+somatorio);
        System.out.print("Média: "+(somatorio/repeticoes));
        sc.close();

    }
}
