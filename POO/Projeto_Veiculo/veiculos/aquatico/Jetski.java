package veiculos.aquatico;

public class Jetski extends Aquatico{
    protected int capacidadePessoas;

    public Jetski(String nome, boolean possuiHelice, int capacidadePessoas){
        super(nome, possuiHelice);
        this.capacidadePessoas = capacidadePessoas;
    }
    @Override
    public void mover(){
        System.out.println(String.format("O Jetski %s está se movendo na água com a velocidade %.2f km/h com %d pessoas à bordo.", nome, velocidade, capacidadePessoas));
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Possui Hélice: "+ possuiHelice);
        System.out.println("Pesoas à bordo: "+ capacidadePessoas);
    }
}
