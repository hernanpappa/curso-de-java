package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Para recorrer una matriz debemos de hacer uso de for anidado
        //El primer for nos permitira recorrer las filas y el segundo las columnas

        int matriz [][] = new int[4][3];


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

        //Con este for nos ahorramos todas las lineas de codigo de arriba excepto:
        //int matriz[][] = new int[4][3];
        for( int posX = 0; posX < matriz.length; posX++){

            //En este caso matriz[posX].length nos devolvera la cantidad de columnas que tenemos en la fila
            for ( int posY = 0; posY < matriz[posX].length; posY++){

                matriz[posX][posY] =  posY + 1;

            }

        }

        //En este caso matriz.length nos devolvera la cantidad de filas, ya que es un arreglo de arreglos
        for( int posX = 0; posX < matriz.length; posX++){

            //En este caso matriz[posX].length nos devolvera la cantidad de columnas que tenemos en la fila
            for ( int posY = 0; posY < matriz[posX].length; posY++){

                System.out.print(matriz[posX][posY]);

            }
            System.out.println();

        }

        System.out.println();

        //Podemos usar un foreach anidado para hacer lo de arriba mas simple
        for (int fila[] : matriz){

            for (int columna : fila){

                System.out.print(columna);

            }
            System.out.println();
        }

    }
}
