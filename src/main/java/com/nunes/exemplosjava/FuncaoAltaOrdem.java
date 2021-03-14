package com.nunes.exemplosjava;

public class FuncaoAltaOrdem {
    public static void main(String[] args){
        Calculo soma = (a,b) -> a+b;
        Calculo subtrai = (a,b) -> a-b;
        Calculo divide = (a, b) -> a/b;
        Calculo multiplica = (a, b) -> a*b;
        System.out.println(executarOperacao(soma, 5, 10)); //15
        System.out.println(executarOperacao(subtrai, 15, 6));// 9
        System.out.println(executarOperacao(divide, 15, 3)); // 5
        System.out.println(executarOperacao(multiplica, 7, 3)); //21

    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }
}
@FunctionalInterface
interface Calculo{
    public  int calcular(int a, int b);
}