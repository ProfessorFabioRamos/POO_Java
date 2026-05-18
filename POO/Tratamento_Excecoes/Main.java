public class Main{
    public static void main(String[] args){
        //Divisao divisao = new Divisao(10, 0);
        //divisao.dividir();

        //Idade idade = new Idade(2026);
        //idade.calcularIdade();

        Apresentar apresentar = null;

        try{
            apresentar.apresentacao("Manuel");
        }catch(NullPointerException e){
            System.out.println("Erro crítico: Objeto ou atributo nulo");
            System.out.println(e.getMessage());
        }
    }
} 
