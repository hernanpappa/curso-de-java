package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.suma(10 , 20);
        int resultado2 = calculadora.suma(10, 20, 40);
        int resultado3 = calculadora.suma();
        float resultado4 = calculadora.suma(10.5f , 20.4f);
        double resultado5 = calculadora.suma(5.612903234f, 1.1213573906f);

        System.out.println("El resultado es: " + resultado);
        System.out.println("El resultado es: " + resultado2);
        System.out.println("El resultado es: " + resultado3);
        System.out.println("El resultado es: " + resultado4);
        System.out.println("El resultado es: " + resultado5);
    }
}
