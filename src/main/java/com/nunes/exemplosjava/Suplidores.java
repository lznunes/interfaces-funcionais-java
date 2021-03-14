package com.nunes.exemplosjava;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args){
        Supplier<Pessoa> instanciaPessoa  = () -> new Pessoa();
        System.out.println(instanciaPessoa.get());
    }
}

class Pessoa {
    private String nome;
    private final int idade;
    public Pessoa(){
        nome = "Luiz";
        idade = 43;
    }

    @Override
    public  String toString() {
        return String.format("nome : %s, idade: %s", nome, idade);

    }



}
