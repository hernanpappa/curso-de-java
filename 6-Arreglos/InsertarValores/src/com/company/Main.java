package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //insertar valores

        int valores[] = new int[10];

        for ( int indice = 0; indice < valores.length;  indice++){

            valores[indice]= indice;

        }

        for ( int valor : valores){

            System.out.println(valor);

        }

        //Con todoo esto nos ahorramos muchas lineas de codigo
    }
}
