package com.tieto.trainings.java.lesson1;

public class HelloWorld {
    private static String name;
    public static void main(String[] args) {
        name = "Zivan";
        sayHello(name);
    }

    private static void sayHello(String name) {
        System.out.println("You are " + HelloWorld.name);
        System.out.println("Hello World!" + name);
    }
}


