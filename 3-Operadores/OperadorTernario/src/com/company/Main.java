package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * Java tiene un operador especial: el operador ternario
         * IFTTT (Sus siglas en ingles
         * Usa el signo de interrogracion?
         *
         * Su estructura base es la siguiente:
         * Expresion1 ? Expresion2 : Expresion 3
         *
         * La expresion1 debe evaluar un booleano
         * Si expresion1 = true entonces expresion2
         * Si expresion1 = false entonces expresion3
         */

        //Ejemplo:      Expresion1   Expresion2   Expresion3
        String mensaje =  10 > 90  ?  "Es mayor" :  "Es menor";
        System.out.println(mensaje);

        int numero = true ? 1 : 0;
        System.out.println(numero);

        
    }
}
