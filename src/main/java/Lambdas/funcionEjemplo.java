/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

import java.util.function.Function;

/**
 *
 * @author bryan
 */
public class funcionEjemplo {
    static Function<Integer, Integer> multiplicar = n -> n * 10;
    static Function<Integer, Integer> sumar = n -> n + 10;
    static Function<Integer, Integer> usoAndThen = multiplicar.andThen(sumar);
    static Function<Integer, Integer> usoCompose = multiplicar.compose(sumar);
    
    public static void main(String[] args){
        System.out.println(multiplicar.apply(10));
        System.out.println(sumar.apply(10));
        System.out.println(usoAndThen.apply(3));
        System.out.println(usoCompose.apply(3));
    }
}
