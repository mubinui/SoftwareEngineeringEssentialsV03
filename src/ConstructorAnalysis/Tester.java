package ConstructorAnalysis;

import Polymorphism.Compiletime;

public class Tester {
    static {
        System.out.println("My name is mubin ");
        Compiletime c = new Compiletime();
        c.read();
        c.read("ABC");
    }

    public static void main(String[] args) {
        
    }
}
