package com.lambda.app;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnotacionesDeRepeticion {

    public static void main(String[] args) {
        Videojuegos videojuegos = VideoJuegosVariados.class.getAnnotation(Videojuegos.class);
        for (Videojuego videojuego : videojuegos.value()) {
            System.out.println(videojuego.value());
        }
    }

    //crear tu propia anotación
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Videojuegos {
        Videojuego[] value() default {};
    }

    @Repeatable(value = Videojuegos.class)
    public @interface Videojuego {
        String value();
    }

    @Videojuego("League of legends")
    @Videojuego("Halo 5")
    @Videojuego("Warzone")
    @Videojuego("No se que más poner")


    public interface VideoJuegosVariados {

    }
}
