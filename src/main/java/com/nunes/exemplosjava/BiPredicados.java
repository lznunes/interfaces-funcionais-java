package com.nunes.exemplosjava;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.ToIntBiFunction;

public class BiPredicados {
    public static void main(String[] args){
        Integer n1 = 10;
        Integer n2 = 25;
        BiPredicate<Integer, Integer> testaNumeros =  (numero1, numero2) ->
                numero1 > 0 && numero2 > 0;
        BiFunction<Integer, Integer, Integer> soma = (numero1, numero2) ->
                //necessario especificar o tipo do resultado tambem e os numeros
                numero1 + numero2;
        ToIntBiFunction<Integer, Integer> multiplica = (numero1, numero2) ->
                //essa funcition ja espera resultado inteiro nao precisa passar
                numero1 * numero2;
        if (testaNumeros.test(n1, n2)){
            System.out.println(soma.apply(n1, n2));
            System.out.println(multiplica.applyAsInt(n1,n2));
        }
    }
}
