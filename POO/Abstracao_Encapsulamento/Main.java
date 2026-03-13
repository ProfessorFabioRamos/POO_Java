public class Main{
    public static void main(String[] args){
        // Chamada do método construtor
        Carro carro_1 = new Carro("Honda","Civic", 2017);
        carro_1.acelerar();
        System.out.println(carro_1.mostrarMarca());
        carro_1.mostrarInfo();
    }
}
