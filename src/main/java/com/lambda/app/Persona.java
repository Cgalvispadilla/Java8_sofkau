package com.lambda.app;

public interface Persona {
    void caminar();

    default void hablar() {
        System.out.println("Hola chiquita c:");
    }
}
