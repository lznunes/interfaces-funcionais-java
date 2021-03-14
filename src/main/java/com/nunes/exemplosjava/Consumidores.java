package com.nunes.exemplosjava;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args){
        Consumer<String> imprimefrase = frase -> System.out.println(frase);
        Consumer<String> imprimirsegunda = System.out::println;
        imprimefrase.accept("Ola Mundo!");
        imprimirsegunda.accept("Ola Mundo outra vez!");
    }
}
