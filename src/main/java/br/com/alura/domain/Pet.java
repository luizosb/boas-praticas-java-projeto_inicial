package br.com.alura.domain;

public class Pet {

    private Long id;

    private String nome;
    private String tipo;
    private String raca;
    private int idade;
    private String cor;
    private Float peso;

    public Pet(String nome, String tipo, String raca, int idade, String cor, Float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
}
