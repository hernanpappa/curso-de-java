package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Retornar valores

        Triangulo triangulo = new Triangulo();
        triangulo.base = 10;
        triangulo.altura = 20;

        //Cuando un metodo devuelve un valor, debemos guardalo en una variable o utilizarlo
        float resultado = triangulo.area();

        System.out.println(resultado);
        System.out.println(triangulo.area());

    }
}
