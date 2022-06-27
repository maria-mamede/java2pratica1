package com.company;

public class Pessoa {

    String nome, id;
    int idade;
    double peso, altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    int calcularIMC(){
        double imc = this.peso / (this.altura*this.altura);
        int result = 0;

        if (imc<20){
            result = -1;
        } else if (imc>=20 && imc<=25){
            return result;
        } else if (imc>25){
            result = 1;
        }

        return result;
    }

    boolean ehMaiorIdade(){
        return this.idade >= 18;

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.nome + '\'' +
                ", id='" + this.id + '\'' +
                ", idade=" + this.idade +
                ", peso=" + this.peso +
                ", altura=" + this.altura +
                '}';
    }
}
