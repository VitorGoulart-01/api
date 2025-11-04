package com.atividadejava.atividadecopiada.produto;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;

    public Produto(){

    }

    public Produto(String nome, double preco, String descricao){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        

    }
    public String getDescricao(){
        return descricao;

    }
    public void setDescricao(String descricao){
        this.descricao = descricao;

    }

    public String getNome(){
        return nome;
    
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    @Override
    public String toString(){
        return "Produto{" +
        "nome='" + nome + '\'' + 
        ", preco=" + preco + '\'' +
        "descricao=" + descricao + '\'' +
        '}';

    }

}
