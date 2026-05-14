package poo.sistemabancario;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(int numero, int agencia, Cliente cliente) {
        super(numero, agencia, cliente);
    }
    
    @Override
public void sacar(BigDecimal valor){

    BigDecimal taxa = new BigDecimal("2");

    BigDecimal valorComTaxa =
            valor.add(taxa);

    super.sacar(valorComTaxa);
}
    
}
