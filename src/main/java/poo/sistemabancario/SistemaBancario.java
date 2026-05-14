package poo.sistemabancario;

import java.math.BigDecimal;

public class SistemaBancario {

    public static void main(String[] args) {
        System.out.println("-----Banco CCO-----");
        System.out.println("Cadastro de Cliente:");
        
        Cliente p1 = new Cliente("Paulo", "111.222.333-45");
        System.out.println("Dados: " + p1.status());
        Cliente p2 = new Cliente("Pedro", "222.333.444-50");
        System.out.println("Dados: " + p2.status());
        
        System.out.println("Abrindo Conta.");
        
        ContaPoupanca cp = new ContaPoupanca(123, 1, p1);
                
        cp.abrirConta();
        cp.depositar(new BigDecimal("100"));
        cp.aplicarRendimento();
        
    
        ContaCorrente cr = new ContaCorrente(456, 2, p2);
        
        cr.abrirConta();
        cr.sacar(new BigDecimal("50")); //não há saldo
        
        cp.transferir(new BigDecimal("50"), cr);
        
        System.out.println(cr.getSaldo());
        
        cp.sacar(new BigDecimal("10"));
        cr.sacar(new BigDecimal("5"));
        
        System.out.println("Saldo atualizado:");
        System.out.println(cp.getSaldo());
        System.out.println(cr.getSaldo());
    }
}












