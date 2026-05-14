package poo.sistemabancario;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public abstract class Conta implements IConta {
    
    private final int numero; //Número da conta
    private final int agencia;
    private boolean ativa;
    private BigDecimal saldo;
    private final Cliente cliente; // Agregação
    
    //histórico das operações
    private List<Transacao> historico;
    
    public Conta(int numero, int agencia, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.ativa = false;
        this.saldo = BigDecimal.ZERO;
        
        this.historico = new ArrayList<>();
    }
    

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    

    @Override
    public void abrirConta() {
        if(!this.ativa){
            this.ativa = true;
            System.out.println("Abertura de conta concluida com sucesso !");
        }else{
            System.out.println("Conta já está ativa.");
        }
              
    }

    @Override
    public void encerrarConta() {
        
        if(!this.ativa){
        System.out.println("Conta já está encerrada.");
        return;
    }
        
        if(this.saldo.compareTo(BigDecimal.ZERO) == 0){
            this.ativa = false;
            System.out.println("Conta encerrada com sucesso.");
        }else{
            System.out.println("Para encerrar conta, saldo precisa está zerado.");
        }    
    }

    @Override
    public void sacar(BigDecimal valor) {
        if(!this.ativa){
        System.out.println("Conta inativa.");
        return;            
        }
        
        if(valor.compareTo(BigDecimal.ZERO) <= 0){
        System.out.println("Valor inválido.");
        return;
        }
          
        if(this.saldo.compareTo(valor) >= 0){
            this.saldo = this.saldo.subtract(valor);
            
            historico.add(new Transacao("SAQUE", 
                              valor, 
                              LocalDateTime.now()));
            
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        if(!this.ativa){
            System.out.println("Conta inativa.");
            return;
        }
        
          if(valor.compareTo(BigDecimal.ZERO) <= 0){
        System.out.println("Valor inválido.");
        return;
        
        }    
            this.saldo = this.saldo.add(valor);
            System.out.println("Deposito realizado com sucesso.");
            historico.add(new Transacao("DEPOSITO", 
                              valor, 
                              LocalDateTime.now()));
    }

    @Override
    public void transferir(BigDecimal valor, Conta contaDestino) {
          
        if(!this.ativa){
            System.out.println("Conta inativa");
            return;
        }
        
        if(!contaDestino.isAtiva()){
            System.out.println("Conta destino inválida");
            return;
        }
        
        if(valor.compareTo(BigDecimal.ZERO) <=0) {
            System.out.println("Valor inválido");
            return;
        }
        if(this.saldo.compareTo(valor) < 0){
            System.out.println("Saldo insuficiente");
            return;
        }
        
        this.saldo = this.saldo.subtract(valor);
        
        contaDestino.depositar(valor);
        System.out.println("Transferencia conluida.");
        
        historico.add(new Transacao("TRANSFERENCIA", 
                          valor, 
                          LocalDateTime.now()));
    }
    
    



}
