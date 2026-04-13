package app;

import veiculos.terrestre.Carro;

public class Main {
    public static void main(String[] args){
        // Não é possível instanciar objeto de classe abstrata
        //Veiculo veiculo_1 = new Veiculo("Fusca");

        //Terrestre terrestre_1 = new Terrestre("Tanque de Guerra", 8);
        Carro carro_1 = new Carro("Opala", 4, "Gasolina");
        carro_1.acelerar(100);
        carro_1.mover();
        carro_1.desacelerar(20);
        carro_1.mover();
    }
}
