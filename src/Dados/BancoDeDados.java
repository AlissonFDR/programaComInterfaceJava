package Dados;

import java.util.ArrayList;
import Entidades.Cliente;
import Entidades.Usuario;
import Entidades.Produtos;

public class BancoDeDados {
    private static final ArrayList<Cliente> clientela = new ArrayList();
    private static final ArrayList<Usuario> organizacao = new ArrayList();
    private static final ArrayList<Produtos> estoque = new ArrayList();
        
    public static ArrayList<Cliente> getClientela(){
        return clientela;
    }
    
    public static ArrayList<Usuario> getOrganizacao(){
        return organizacao;
    }
    
    public static ArrayList<Produtos> getEstoque(){
        return estoque;
    }
    
    public static void admin(){
        boolean admin = false;
        if(admin==false){
            Usuario ADM = new Usuario();
            ADM.setId(0);
            ADM.setUsuario("admin");
            ADM.setSenha("admin");
            BancoDeDados.adicionar(ADM);
            admin=true;
        }else{

        }

    }
    //Funções usuario
    public static void editarUsuario(String idUser , String novoUsuario){
        for(Usuario u : BancoDeDados.getOrganizacao()){
            if(u.getId().equals(idUser)) {
                u.setUsuario(novoUsuario);
            }
        }
    }
    public static void editarUsuarioNome(String idUser , String novoNome){
        for(Usuario u : BancoDeDados.getOrganizacao()){
            if(u.getId().equals(idUser)) {
                u.setNome(novoNome);
            }
        }
    }
    public static void editarUsuarioCpf(String idUser , String novoCpf){
        for(Usuario u : BancoDeDados.getOrganizacao()){
            if(u.getId().equals(idUser)) {
                u.setCpf(novoCpf);
            }
        }
    }
    //Não deixa usuarios duplicados
    public static boolean testaUsuario(String usuario){
        boolean testeUsuario=false;
        for(Usuario U : BancoDeDados.getOrganizacao()){
                testeUsuario = !U.getUsuario().equals(usuario);
        }
        return testeUsuario;
    }  
    //Funções cliente
    public static void editarClienteNome(String idCliente , String novoNome){
        for(Cliente c : BancoDeDados.getClientela()){
            if(c.getId().equals(idCliente)) {
                c.setNome(novoNome);
            }
        }
    }
    public static void editarClienteCpf(String idCliente , String novoCpf){
        for(Cliente c : BancoDeDados.getClientela()){
            if(c.getId().equals(idCliente)) {
                c.setCpf(novoCpf);
            }
        }
    }
    
    public static void editarClienteCidade(String idCliente , String novaCidade){
        for(Cliente c : BancoDeDados.getClientela()){
            if(c.getId().equals(idCliente)) {
                c.setCidade(novaCidade);
            }
        }
    }
    public static void editarClienteUF(String idCliente , String novaUF){
        for(Cliente c : BancoDeDados.getClientela()){
            if(c.getId().equals(idCliente)) {
                c.setUf(novaUF);
            }
        }
    }
    public static void editarClienteTelefone(String idCliente , String novoTelefone){
        for(Cliente c : BancoDeDados.getClientela()){
            if(c.getId().equals(idCliente)) {
                c.setTelefone(novoTelefone);
            }
        }
    }
    
    //Funcões Produto
    public static void editarProdutoDescricao(String idProduto , String novaDescricao){
        for(Produtos p : BancoDeDados.getEstoque()){
            if(p.getId().equals(idProduto)) {
                p.setDescricao(novaDescricao);
            }
        }
    }
    public static void editarProdutoPreco(String idProduto , double novoPreco){
        for(Produtos p : BancoDeDados.getEstoque()){
            if(p.getId().equals(idProduto)) {
                p.setPreco(novoPreco);
            }
        }
    }
    public static void editarProdutoQuantidade(String idProduto , int novaQuantidade){
            for(Produtos p : BancoDeDados.getEstoque()){
                if(p.getId().equals(idProduto)) {
                    p.setQuantidade(novaQuantidade);
                }
            }

    }
    
    //Funcoes para adicionar ou remover
    public static void adicionar(Cliente clientes){
        clientela.add(clientes);
    }
    
    public static void adicionar(Usuario User){
        organizacao.add(User);
    }
    
    public static void adicionar(Produtos produto){
        estoque.add(produto);
    }
    
    public static boolean excluirCliente(int indice){
        if(indice<0 || indice>=clientela.size()){
            return false;
    }
    clientela.remove(indice);
        return true;
    }
    
    public static boolean excluirUsuario(int indice){
        if(indice<0 || indice>=organizacao.size()){
            return false;
    }
        organizacao.remove(indice);
        return true;
    }
    
    public static boolean excluirProduto(int indice){
        if(indice<0 || indice>=estoque.size()){
            return false;
    }
        estoque.remove(indice);
        return true;
    }

}