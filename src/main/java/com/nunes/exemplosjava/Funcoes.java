package com.nunes.exemplosjava;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args){
        Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converteParaInterio = string -> Integer.valueOf(string);
        Function<String, Integer> converteParaInteiroEmultiplica = string -> Integer.valueOf(string) * 2;
        System.out.println(retornaNomeAoContrario.apply("Luiz"));
        System.out.println(converteParaInterio.apply("20"));
        System.out.println((converteParaInteiroEmultiplica.apply("40")));
    }

}
