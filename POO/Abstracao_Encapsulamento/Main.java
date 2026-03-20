public class Main{
    public static void main(String[] args){
        // Chamada do método construtor
        Carro carro_1 = new Carro("Honda","Civic", 2017);
        carro_1.acelerar();
        carro_1.acelerar(200.20f);
        System.out.println(carro_1.getMarca());
        System.out.println(carro_1.getModelo());
        carro_1.setAno(2018);   // valor válido
        carro_1.setAno(2077);   // valor inválido
        System.out.println(carro_1.getAno());
        //carro_1.mostrarInfo();
    }
}
