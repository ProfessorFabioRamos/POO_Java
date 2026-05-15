public class Divisao {
    public int numerador;
    public int denominador;

    public Divisao(int n, int d){
        numerador = n;
        denominador = d;
    }

    public void dividir(){
        System.out.println("Iniciando a operação");

        try{
            int resultado = numerador/denominador;
            System.out.println("O resultado é: "+resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro, não é possível dividir número por 0");
            System.out.println(e.getMessage());
        }
        System.out.println("Operação Finalizada");
    }
}
