public class Carro {
    // Atributos (variáveis)
    // Atributos Encapsulados (private)
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeMaxima;
    private double velocidaAtual;
    private boolean automatico;

    //Método Construtor
    public Carro(String MARCA, String MODELO, int ANO){
        this.marca = MARCA;
        this.modelo = MODELO;
        this.ano = ANO;
        this.velocidadeMaxima = 250;
        this.velocidaAtual = 0;
        this.automatico = true;
    }

    // Método
    public void acelerar(){
        System.out.println("VRUUUMMMM");
    }

    // Sobrecarga do método acelerar()
    public void acelerar(float novaVelocidade){
        velocidaAtual = novaVelocidade;
        // Format de String = %d (int) %s (String) %f (decimais float e double)
        String velText = String.format("Nova velocidade: %.2f Km/h", velocidaAtual);
        System.out.println(velText);
    }

    // Método privado, só pode ser acessado dentro da classe
    private String maiuscula(String txt){
        return txt.toUpperCase();
    }

    // Métodos Getters
    public String getMarca(){
        String marcaUpper = maiuscula(marca);
        return marcaUpper;
    }

    public String getModelo(){
        String modeloLower = modelo.toLowerCase();
        return modeloLower;
    }

    public int getAno(){
        return ano;
    }

    // Métodos Setters
    public void setAno(int novoAno){
        if(novoAno > 2000 && novoAno <= 2026){
            ano = novoAno;
        }
        else{
            System.out.println("Ano inválido");
        }
    }

    public void setMarca(String novaMarca){
        if(novaMarca != null && !novaMarca.isEmpty()){
            marca = novaMarca;
        }
        else{
            System.out.println("Marca inválida");
        }
    }

    public void setModelo(String novoModelo){
        // Se houver apenas um comando na condicional 
        // não é necessário utilizar chaves {}
        if(novoModelo != null && !novoModelo.isEmpty())
            modelo = novoModelo;
        else
            System.out.println("Modelo inválida");
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano de Fabricação: "+this.ano);
        System.out.println("Velocidade Máxima: "+this.velocidadeMaxima);
        System.out.println("Automático: "+this.automatico);
    }
}
