package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Instrucciones de control sobre iteracion
        //Ciclo while: nos permite ejecutar un bloque de codigo de forma repetida
        //hasta que una condicion deje de cumplirse

        int contador = 1;
        while( contador < 11 ){

            System.out.println("Hola mundo!" + contador);
            contador++;
        }

        int vueltas = 0;
        int numero = 123456789;

        while( numero > 0 ){

            numero /= 10; //Es lo mismo que numero = numero / 10;
            vueltas ++;
        }

        System.out.println("El numero posee " + vueltas + " digitos.");
    }
}
