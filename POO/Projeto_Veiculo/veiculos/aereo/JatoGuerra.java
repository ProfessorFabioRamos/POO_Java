package veiculos.aereo;

public class JatoGuerra extends Aereo{
    protected int misseis;

    public JatoGuerra(String nome, int misseis){
        super(nome);
        this.misseis = misseis;
    }

    @Override
    public void mover(){
        System.out.println(String.format("O Jato de Guerra %s está se movendo com a velocidade %.2f km/h na altitude %.2f metros",nome,velocidade, altitude));
    }

    @Override
    public void ganharAltitude(double incremento){
        if (incremento > 0) altitude += incremento;
    }

    @Override
    public void perderAltitude(double decremento){
        if(decremento > 0){
            altitude -= decremento;
            if (altitude < 0) altitude = 0;
        }
    }
}
