package veiculos;

// Classe Abstrata (não instancia objetos)
public abstract class Veiculo {
    public String nome;
    public double velocidade;

    public Veiculo(String nome){
        this.nome = nome;
        velocidade = 0;
    }

    public void acelerar(double incremento){
        if(incremento > 0){
            velocidade += incremento;
        }
    }
    
    public void frear(double decremento){
        if(decremento > 0){
            velocidade -= decremento;
            if(velocidade < 0){
                velocidade = 0;
            }
        }
    }

    // Método Abstrato - contrato que obriga as subclasses a implementar este método
    public abstract void mover();
}
