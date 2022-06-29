package com.mispruebas;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int Suma(int a, int b) {
        return a + b;
    }

    public int Suma(int a, int b, int c) {
        return a + Suma(a, b);
    }

    public double Suma(double a, double b) {
        return a + b;
    }

    public int Multiplica(int a, int b) {
        return a * b;
    }

}
