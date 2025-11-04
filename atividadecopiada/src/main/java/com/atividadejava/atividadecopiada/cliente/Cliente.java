package com.atividadejava.atividadecopiada.cliente;

public class Cliente {
    private String nome;
    private int idade;
    private String email;
    private double numero;

    public Cliente(){

    }

    public Cliente(String nome, int idade, String email, double numero){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.numero = numero;

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public double getNumero(){
        return numero;

    }
    public void setNumero(double numero){
        this.numero = numero;
    }
    @Override
    public String toString(){
        return "Cliente{" +
         "nome='" + nome + '\'' +
          ", idade=" + idade + 
          ",email=" + email + '\'' +
          ",numero=" + numero + '\'' +
          '}';
    }

}
