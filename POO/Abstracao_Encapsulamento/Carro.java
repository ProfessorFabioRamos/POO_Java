public class Carro {
    // Atributos (variáveis)
    // Atributos encapsulados (private)
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

    //Método privado (só pode ser usado dentro da classe)
    private String maiusculo(String txt){
        return txt.toUpperCase();
    }

    // Com retorno
    // Getter
    public String getMarca(){
        String marcaUpper = maiusculo(marca);
        return marcaUpper;
    }
    // Getter
    public String getModelo(){
        String modeloLower = modelo.toLowerCase();
        return modeloLower;
    }

    public int getAno(){
        return ano;
    }

    //Setter
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
        // If e else sem chaves {} apenas se for um único comando
        if(novoModelo != null && !novoModelo.isEmpty())
            modelo = novoModelo;
        else
            System.out.println("Modelo inválido");
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano de Fabricação: "+this.ano);
        System.out.println("Velocidade Máxima: "+this.velocidadeMaxima);
        System.out.println("Automático: "+this.automatico);
    }
}
