package poo.sistemabancario;

public class Cliente{
    private String nome;
    private final String cpf;
    
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
    
    public String getCpf() {
        return cpf;
    }
        
    public String status(){
        return "Nome: " + this.getNome() +
                " | CPF: " + this.getCpf();
        
    }
        
}
