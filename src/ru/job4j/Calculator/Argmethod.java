package ru.job4j.Calculator;

public class Argmethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name+age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        Argmethod.hello(name, age);


    }
}

