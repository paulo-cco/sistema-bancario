package poo.sistemabancario;
import java.math.BigDecimal;

public interface IConta {
    void abrirConta();
    void encerrarConta();
    void sacar(BigDecimal valor);
    void depositar(BigDecimal valor);
    void transferir(BigDecimal valor, Conta contaDestino);
    
}
