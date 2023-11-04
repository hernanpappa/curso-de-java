package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Arreglos
        //Es una estructura  de datos
        //Permite almacenar datos del mismo tipo (es como una lista)
        //la longitud es inmutable, se define una sola vez
        //cada dato almacnado  en el arreglo le pertenece a un indice
        //los arreglos comienzan en el indice 0
        //los arreglos pueden ser de muchas dimensiones
        //La estructura de un arreglo es la siguiente

        //Podemos definir un arreglo y posteriormente asignarle su longitud, sino no puede usarse
        String nombres[];
        nombres = new String[3]; //Este string tiene 3 espacios: indices 0, 1 y 2

        //para asignar o modificar un valor en un indice lo hacemos de la siguiente manera:

        nombres[0] = "Codi1";
        nombres[1] = "Hernan";
        nombres[2] = "Rodolfo";

        //Si queremos acceder a los datos debemos de poner la variable[indice]
        System.out.println( nombres[0] );
        System.out.println( nombres[1] );
        System.out.println( nombres[2] );




    }
}
