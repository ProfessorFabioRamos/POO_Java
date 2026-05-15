package veiculos.terrestre;

import veiculos.interfaces.IMotorizado;
import veiculos.interfaces.ITripulavel;

// Classe Concreta
public class Carro extends Terrestre implements IMotorizado, ITripulavel{
    protected String tipoCombustivel;
    protected boolean motorLigado;
    protected int passageiros;

    public Carro(String nome, int numeroRodas, String tipoCombustivel){
        super(nome, numeroRodas);
        this.tipoCombustivel = tipoCombustivel;
        this.motorLigado = false;
        this.passageiros = 0;
    }

    @Override
    public void mover(){
        System.out.println(String.format("O Carro %s está se movendo com a velocidade %.2f km/h.", this.nome,this.velocidade));
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de rodas: "+numeroRodas);
        System.out.println("Tipo de Combustível: "+tipoCombustivel);
    }

    @Override
    public void ligarMotor(){
        if(velocidade == 0){
            motorLigado = true;
            System.out.println("Motor está ligado!");
        }
    }
    @Override
    public void desligarMotor(){
        if(velocidade == 0){
            motorLigado = false;
            System.out.println("Motor desligado!");
        }
    }
    @Override
    public void embarcar(int quantidade){
        if(passageiros < 5){
            passageiros += quantidade;
            System.out.println(passageiros+" passageiros no veículo.");
        }
    }
    @Override
    public void desembarcar(int quantidade){
        if(passageiros > 0){
            passageiros -= quantidade;
            System.out.println(passageiros+" passageiros no veículo.");
        }
    }

    @Override
    public void acelerar(double incremento){
        if(motorLigado){
            super.acelerar(incremento);
        }
        else{
            System.out.println("O motor está desligado, não é possível acelerar.");
        }
    }
}
