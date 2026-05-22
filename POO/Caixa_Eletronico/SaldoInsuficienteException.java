// Arquivo: SaldoInsuficienteException.java
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        // Repassa a mensagem para a classe super
        super(mensagem); 
    }
}
