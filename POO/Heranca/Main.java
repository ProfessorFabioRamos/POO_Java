public class Main {
    public static void main(String[] args){
        Animal animal_1 = new Animal("Ornitorrinco", 4);
        //animal_1.emitirSom();
        //animal_1.mostrarInfo();

        Cachorro cachorro_1 = new Cachorro(
            "Totó", 10, "Doberman");
        cachorro_1.emitirSom();
        cachorro_1.abanarCauda();
        cachorro_1.mostrarInfo();
    }
}
