package com.lambda.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethotStreams {


    public static void main(String[] args) {
        List<String> s = Arrays.asList("zzz", "Hola", "Hi", "Hello", "Juee", "eu", "joa mani tiempo sin verte");
        List<Integer> n = Arrays.asList(3, 2, 2, 68, 6, 1, 6);
        ArrayList<String> saludos = new ArrayList<>(s);
        ArrayList<Integer> numeros = new ArrayList<>(n);
        //filtrar
        //saludos.stream().filter(saludo -> saludo.startsWith("H")).forEach(System.out::println);
        //ordenar de menor a mayor (ascendente)
        //saludos.stream().sorted().forEach(System.out::println);
        //ordenar de mayor a menor (descendente)
        //saludos.stream().sorted((o1, o2) -> o2.compareToIgnoreCase(o1)).forEach(System.out::println);
        //transformar
        //saludos.stream().map(String::toUpperCase).forEach(System.out::println);
        //numeros.stream().map(num -> num + 1).forEach(System.out::println);
        //limitar lista
        //saludos.stream().limit(2).forEach(System.out::println);
        //tamaño de la lista
        long tam = saludos.stream().count();
        System.out.println(tam);
    }
}
