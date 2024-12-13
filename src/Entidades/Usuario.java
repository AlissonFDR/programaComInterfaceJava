
package Entidades;

public class Usuario extends Pessoa {
    private String usuario, senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{"+"ID: "+ getId() + ", nome=" + getNome() + ", CPF=" + getCpf() + ", usuario=" + usuario + ", senha=" + senha +'}';
    }
    
}