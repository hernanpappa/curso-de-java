package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //La estructura es opcional. Aunque siempre debemos usar la condicion
        for( int numero = 9, x = 1; x < 11 ; x++){

            int resultado = numero * x;
            String mensaje = numero + " * " + x + " = " + resultado;

            System.out.println(mensaje);
        }
    }
}
