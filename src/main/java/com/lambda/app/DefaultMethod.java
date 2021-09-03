package com.lambda.app;

public class DefaultMethod implements Persona {

    public static void main(String[] args) {
        DefaultMethod dm = new DefaultMethod();
        dm.caminar();
        dm.hablar();
    }

    @Override
    public void caminar() {
        System.out.println("toy caminando");
    }

}
