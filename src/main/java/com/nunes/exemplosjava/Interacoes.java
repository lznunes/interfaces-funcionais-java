package com.nunes.exemplosjava;

import org.springframework.boot.autoconfigure.security.servlet.StaticResourceRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args) {
        String[] nomes = {"Luiz", "Antonio", "Nunes", "Neve"};
        Integer[] numeros = {1, 2, 3, 4};
        //imprimeNomeFiltrados(nomes);
        //imprimeTodosNomes(nomes);
        List<String> profissoes = new ArrayList<>();
        profissoes.add("Diretor de TI");
        profissoes.add("Diretor de marketing");
        profissoes.add(("Diretor de RH"));
        profissoes.add("Diretor de vendas");
        profissoes.add("Gerente de TI");
        profissoes.add("Gerente de marketing");
        profissoes.add("Gerente de vendas");
        profissoes.add("Gerente de RH");
        profissoes.stream().filter(profissao -> profissao.startsWith("Diretor"))
                .forEach(System.out::println);

    }
    public static void imprimeNomeFiltrados(String... nomes){
        String nomeparaimprimir = " ";
        for(int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Luiz")){
                nomeparaimprimir += "" + nomes[i];
            }
        }
        System.out.println("Nomes do for:" + nomeparaimprimir);
        String nomeParaImprimirStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Antonio"))
                .collect(Collectors.joining());

        System.out.println("Nome do Strem " + nomeParaImprimirStream);
    }

    private static void imprimeTodosNomes(String... nomes){
        System.out.println("utilizando o for: ");
        for(String nome : nomes) System.out.println(nome);
        System.out.println("Utilizando o stream:");
        Stream.of(nomes)
                .forEach(nome -> System.out.println(nome));
    }
    private static void imprimeODobro(Integer... numeros){
        System.out.println("Utilizando o for para imprimir o dobro");
        for (Integer numero : numeros){
            System.out.println(numero*2);
        }
        System.out.println("Utilizando o Stream para imprimir o dobro");
        Stream.of(numeros).map(numero -> numero*2)
                .forEach(System.out::println);
    }


}
