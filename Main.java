import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //System.out.println("Hello World!");
        /*
        int idade = 27;
        float altura = 1.75f;
        char categoria  = 'B';
        String nome = "Carlos";
        boolean cadastroAtivo = true;

        //OPERADORES ARITMETICOS
        a + b (Adição)
        a - b (Subtração)
        a * b (Multiplicação)
        a / b (Divisão)
        a % b (Divisão retornando o resto)

        //OPERADORES Relacionais e Lógicos
        a > b (Maior)
        a >= b (Maior ou igual)
        a < b (Menor)
        a <= b (Menor ou igual)
        a == b (Igual)
        a != b (Diferente)

        a > b && a > 0 (E=AND) 
        a > b || a > 0 (Ou=OR)
        a ^ b (XOR)
        !a (Negação)
        */
        
        float pesoMaximo = 130;     //Peso maximo permitido
        float pesoLimite= 500;      //Peso maximo real

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        float peso = sc.nextFloat();
        System.out.println("Peso: "+peso);

        if(peso >= pesoMaximo && peso < pesoLimite){
            System.out.print("Não é permitido utilizar o tobogã!");
        }
        else if(peso < pesoMaximo && peso > 0){
            System.out.print("É permitido utilizar o tobogã.");
        }
        else{
            System.out.print("Peso inválido.");
        }
    }
}