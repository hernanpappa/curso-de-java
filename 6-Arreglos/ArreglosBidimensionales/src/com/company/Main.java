package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Los arreglos multidimencionales son arreglos de arreglos
        //Los arreglos multidimencionales tienen arreglos en sus indices en vez de valores

        //Ahora vamos a usar uno bidimensional, llamado matriz
        //Matrices: Una tabla con filas y columnas, dos dimensiones
        //cada corchete define las dimensiones
        //Un corechete es un arreglo
        //Dos corchetes es una matriz
        //Tres corchetes es un arreglo tridimensional

        //Nuestra matriz sera de 4 filas y 3 columnas
        int matriz [][] = new int[4][3];

        //x = 0, y = 0 son las coordenadas
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 1;
        matriz[1][1] = 2;
        matriz[1][2] = 3;

        matriz[2][0] = 1;
        matriz[2][1] = 2;
        matriz[2][2] = 3;

        matriz[3][0] = 1;
        matriz[3][1] = 2;
        matriz[3][2] = 3;

        System.out.println(matriz[0][0]);
    }
}
