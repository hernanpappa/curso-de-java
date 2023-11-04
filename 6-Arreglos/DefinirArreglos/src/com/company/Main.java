package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Forma 1 de definir un arreglo: definir el tipo de arreglo y despues su longitud
        //String nombres[];
        //nombres = new String[3];

        //Forma 2 de definir un arreglo: definir tipo de arreglo y longitud en 1 linea de codigo
        //String nombres[] = new String[3];

        //Forma 3 de definir un arreglo: definir el arreglo y sus valores a almacenar y su orden
        //En esta forma no definimos la longitud, pero si intentamos acceder a un indice el cual no esta
        //definido nos saldra un error

        String nombres[] = { "Codi 1", "Hernan", "Rodolfo"};

        //Nos ahoramos estas lineas de codigo con la forma 3
        //nombres[0] = "Codi1";
        //nombres[1] = "Hernan";
        //nombres[2] = "Rodolfo";


        System.out.println( nombres[0] );
        System.out.println( nombres[1] );
        System.out.println( nombres[2] );

    }
}
