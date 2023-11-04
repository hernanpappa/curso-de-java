package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /**
         * Operadores logicos: Operadores que dan verdadero o falso y hay los siguientes
         * and(y), or(o) y not(no)
         *
         * A diferencia que los operadores relacionados
         * los operadores logicos los podemos implementar las veces que necesitemos
         */

        boolean resultado;

        //and(simbolo &&): todas las comparaciones deben ser verdaderas para dar verdadero como resultado
        resultado = 5 >= 5 && true && 10 > 9;
        System.out.println(resultado);

        //or(simbolo ||): una de las comparaciones deben ser verdaderas para dar verdadero como resultado
        resultado = false || false ||false || true;
        System.out.println(resultado);

        //Podemos combinar los operadores relacionales con los logicos
        resultado = (5 >= (2 * 3) || true) && (true && 10 > 5);
        System.out.println(resultado);

        //not(simbolo !): con este operador sera verdadero si el operador es falso y viceversa
        System.out.println(!true);
        // !true = false;
        // !false = true;
    }
}
