public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, String raca){
        // Faz referência ao método construtor da 
        // classe super (Animal)
        super(nome, idade);

        // Novo atributo de Cachorro
        this.raca = raca;
    }

    // Decorador de sobrescrita (Polimorfismo)
    @Override
    public void emitirSom(){
        // Sobrescrita completa
        System.out.println("Au Au");
    }

    @Override
    public void mostrarInfo(){
        // Reaproveitamento do método super
        super.mostrarInfo();
        System.out.println("Raça: "+ raca);
    }

    // Método próprio da subclasse(novo)
    public void abanarCauda(){
        System.out.println(nome+" está abanando a cauda.");
    }
}
