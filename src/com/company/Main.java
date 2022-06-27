package com.company;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Janaina", 15, "1");
        Pessoa pessoa3 = new Pessoa("Augusto", 20, "2", 80.0, 1.79);
        //Pessoa pessoa4 = new Pessoa("Ana", 20); //erro: Cannot resolve constructor 'Pessoa(java.lang.String, int)'

        System.out.println("IMC: " + pessoa3.calcularIMC());
        System.out.println("Maior de idade: " + pessoa3.ehMaiorIdade());
        System.out.println(pessoa3);
    }
}
