
package Entidades;

public class Pessoa {
    private String nome, id, cpf;

     public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    
    public String getId() {
        return id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setId(int id) {
        String idTxt;
        idTxt = id+"";
        this.id = idTxt;
    }
}