package com.lambda.app;

import java.util.Optional;

public class MethotOptional {
    //este metodo mostrara un texto preterminado en caso de que revisa un "null"
    public static void orElse(String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        String aux = op.orElse("Si pones null me veras a mi como mensaje :)");
        System.out.println(aux);
    }

    //metodo para que genere cualquier excepción (en este caso runTimeException)
    public static void orElseThrow(String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        String aux = op.orElseThrow(RuntimeException::new);
        System.out.println(aux);
    }

    //muestra true o false si esta presente el parametro o no
    public static void isPresent(String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        System.out.println(op.isPresent());
    }

    public static void main(String[] args) {
        //orElse(null);
        //new File((String) null);
        //orElseThrow(null);
        isPresent(null);

    }


}