package com.lambda.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        ArrayList<Integer> lista = new ArrayList<>(list);
        System.out.println(list);
        //list.forEach(num -> System.out.println(num));
        //lista.removeIf(n -> (n == 2));
        //lista.forEach(num -> System.out.println(num));
        lista.sort((o1, o2) -> o2.compareTo(o1));

        System.out.println(lista);
    }
}
