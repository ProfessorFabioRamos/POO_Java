package veiculos.terrestre;

import veiculos.interfaces.IMotorizado;
import veiculos.interfaces.ITripulavel;

public class Carro extends Terrestre implements IMotorizado, ITripulavel{
    protected String tipoCombustivel;
    protected boolean motorLigado;
    protected int passageiros;

    public Carro(String nome, int numeroRodas,String tipoCombustivel){
        super(nome,numeroRodas);
        this.tipoCombustivel = tipoCombustivel;
        this.motorLigado = false;
        this.passageiros = 0;
    }

    @Override // Método abstrato de Veículo, obrigação de implementar
    public void mover() {
        System.out.println(String.format("O Carro %s está se movendo com a velocidade %.2f km/h",this.nome,this.velocidade));
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Quantidade de Rodas: "+numeroRodas);
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
            System.out.println(quantidade+" passageiros.");
        }
    }

    @Override
    public void desembarcar(int quantidade){
        if(passageiros > 0){
            passageiros -= quantidade;
            System.out.println(quantidade+" passageiros.");
        }
    }
}
