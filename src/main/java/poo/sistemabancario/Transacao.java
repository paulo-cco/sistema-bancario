package poo.sistemabancario;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {
    private String tipo;
    private BigDecimal valor;
    private LocalDateTime data;

    public Transacao(String tipo, BigDecimal valor, LocalDateTime data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }    
    
    public String getTipo() {
        return tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }
    
        
}
