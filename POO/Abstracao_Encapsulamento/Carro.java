public class Carro {
    // Atributos (variáveis)
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeMaxima;
    private boolean automatico;

    // Método Construtor
    public Carro(String MARCA, String MODELO, int ANO){
        this.marca = MARCA;
        this.modelo = MODELO;
        this.ano = ANO;
        this.velocidadeMaxima = 200;
        this.automatico = true;
    }

    //Métodos da Classe Carro
    // Sem retorno
    public void acelerar(){
        System.out.println("VRUUUUUMMMMM");
    }

    // Sobrecarga do método acelerar()
    public void acelerar(float novaVelocidade){
        // Format de String = %d (int) %s(String)  %f(decimais float e double)
        String texto = String.format(
            "Nova velocidade: %.2f Km/h", novaVelocidade);
        System.out.println(texto);
    }

    // Com retorno
    public String mostrarMarca(){
        return this.marca;
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano de Fabricação: "+this.ano);
        System.out.println("Velocidade Máxima: "+this.velocidadeMaxima);
        System.out.println("Automático: "+this.automatico);
    }
}
