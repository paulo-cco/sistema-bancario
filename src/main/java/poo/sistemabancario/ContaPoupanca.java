package poo.sistemabancario;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int numero, int agencia, Cliente cliente) {
        super(numero, agencia, cliente);
    }
    
    public void aplicarRendimento(){ //0.03
        if(this.isAtiva()){     
            BigDecimal rendimento = getSaldo().multiply(new BigDecimal("0.03"));
            this.depositar(rendimento);
            System.out.println("Rendimento aplicado.");
        }
    }   
     
}
