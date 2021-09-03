package com.lambda.app;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaApp {


    //forma antigua
    /*
    public static void ordenar() {
        List<String> list = Arrays.asList("Carlos", "Andres", "Galvis");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String e:
             list) {
            System.out.println("elemento "+e);
        }
    }
*/


    /**
     * Este metodo ordena de manera desendente
     */
    public static void ordenar() {
        //List<String> list = Arrays.asList("Carlos", "Andres", "Galvis");
        List<Integer> list = Arrays.asList(1, 2, 4, 7, 2);
        Collections.sort(list, Integer::compareTo);
        for (int e : list) {
            System.out.println("elemento " + e);
        }
    }

    public static void main(String[] args) {
        ordenar();
    }
}
