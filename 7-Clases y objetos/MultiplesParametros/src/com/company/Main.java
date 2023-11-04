package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.suma(10, 20, 9, 3, 2, 6, 5, 8, 2);
        float resf = calculadora.suma(4.3f, 5.5f, 8.2f, 7.7f);
        double resd = calculadora.suma(3.1415162732765f,0.0000000000001f);

        System.out.println("El resultado es: " + resultado);
        System.out.println("El resultado f es: " + resf);
        System.out.println("El resultado d es: " + resd);

    }
}
