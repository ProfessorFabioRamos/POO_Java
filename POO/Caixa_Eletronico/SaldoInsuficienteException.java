// Arquivo: SaldoInsuficienteException.java
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem); // Repassa a mensagem para a classe mãe
    }
}
