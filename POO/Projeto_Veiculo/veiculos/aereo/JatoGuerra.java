package veiculos.aereo;

public class JatoGuerra extends Aereo{
    protected int misseis;

    public JatoGuerra(String nome, int misseis){
        super(nome);
        this.misseis = misseis;
    }

    @Override
    public void mover(){
        System.out.println(String.format("O Jato %s está se movendo com a velocidade %.2f km/h a uma altitude de %.2f metros.", nome, velocidade, altitude));
    }
    
    @Override
    public void ganharAltitude(double incremento){
        if(incremento > 0) altitude += incremento;
    }

    @Override
    public void perderAltitude(double decremento){
        if (decremento > 0){
            altitude -= decremento;
            if(altitude < 0) altitude = 0;
        }
    }

    public void atirarMissel(){
        misseis -=1;
        System.out.print("Míssil atirado. Misséis restantes:"+ misseis);
    }
}
