package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * Operadores Relacionales: son simbolos que suamos para comparar 2 valores
         * Al usar estos operadores obtendremos un valor booleano, verdadero o falso
         *
         * Existen 6:
         * Mayor
         * Menor
         * Mayor igual
         * Menor igual
         * Igual
         * Diferente
         *
         * Los operadores relacionales solo los podemos usar solo una vez 
         */

        int variable1 = 300, variable2 = 200;
        boolean resultado;

        resultado = variable1 > variable2; // > mayor
        System.out.println(resultado);

        resultado = variable1 < variable2; // < menor
        System.out.println(resultado);

        resultado = variable1 >= variable2; // >= mayor igual
        System.out.println(resultado);

        resultado = variable1 <= variable2; // <= menor igual
        System.out.println(resultado);

        resultado = variable1 == variable2; // == igual
        System.out.println(resultado);

        resultado = variable1 != variable2; // != diferente
        System.out.println(resultado);
    }
}
