public class Main{
    public static void main(String[]args){
        Animal animal_1 = new Animal("Ornitorrinco", 4);
        animal_1.emitirSom();
        animal_1.mostrarInfo();

        Cachorro cachorro_1 = new Cachorro("Totó", 3, "Labrador");
        cachorro_1.emitirSom();
        cachorro_1.mostrarInfo();
        cachorro_1.abanarCauda();

        Gato gato_1 = new Gato("Garfield", 10);
        gato_1.emitirSom();
        
        //System.out.println(animal_1.nome);
        //System.out.println(animal_1.idade);
        //System.out.println(cachorro_1.nome);
        //System.out.println(cachorro_1.idade);
        //System.out.println(cachorro_1.raca);
    }
}
