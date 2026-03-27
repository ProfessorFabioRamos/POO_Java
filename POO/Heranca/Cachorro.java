public class Cachorro extends Animal{
    public String raca;

    public Cachorro(String nome, int idade, String raca){
        super(nome,idade); //chama o construtor da superclasse
        this.raca = raca;
    }

    // Sobrescrita do método emitirSom(Override)
    @Override
    public void emitirSom(){
        System.out.println("Au Au!");
    } 

    public void abanarCauda(){
        System.out.println(nome+" está abanando a cauda.");
    }
}
