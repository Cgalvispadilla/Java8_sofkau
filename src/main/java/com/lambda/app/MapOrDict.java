package com.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOrDict {
    //map es un diccionario o colleccion de clave - valor
    //lo más parecido a un json
    private Map<Integer, String> map;

    public static void main(String[] args) {
        MapOrDict mapOrDict = new MapOrDict();
        mapOrDict.llenar();
        mapOrDict.insertarSiNoExisteLaKey();
        mapOrDict.filtarElementosYRecolectar();
        //   mapOrDict.imprimir();
    }

    public void llenar() {
        map = new HashMap<>();
        //con el metodo put se llena el map c:
        map.put(1, "Carlos Galvis");
        map.put(2, "Andres Galvis");
        map.put(3, "Carlos Padilla");
        map.put(4, "Andres Padilla");
    }

    public void imprimir() {
        //manera 1
        //map.forEach((integer, s) -> System.out.println("clave: "+integer+" valor: "+s));
        //manera 2
        map.entrySet().stream().forEach(System.out::println);
    }

    public void insertarSiNoExisteLaKey() {
        map.putIfAbsent(5, "Otro carlos c:");
    }

    public void filtarElementosYRecolectar() {
        //Buscamos todos los elementos que tengan "Galvis" y los guardamos en nuevo Map
        Map<Integer, String> nuevoMapa = map.entrySet()
                .stream()
                .filter(e -> e.getValue().contains("Galvis"))
                .collect(Collectors.toMap(n -> n.getKey(), n -> n.getValue()));
        nuevoMapa.entrySet().forEach(System.out::println);
    }
}
