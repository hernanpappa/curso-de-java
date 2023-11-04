package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Arreglos dinamicos
        //En java podemos crear arreglos bidimensionales sin la necesidad de establecer la longitud de las filas
        //De esta manerea podemos crear matrices sin conocer la longitud de cada arreglo

        //Por ejemplo, cuando debemos almacenar las calificaciones de 5 alumnos
        //con cantidades diferentes de materias, si creamos una matriz 5x5 desperdiciamos espacio
        //Lo que debemos hacer es un arreglo que almacene arreglos de diferentes longitudes

        /**
         * Calificaciones de los alumnos:
         *
         * A = 9, 10
         * B = 10, 10, 10, 10
         * C = 9, 9, 10, 10, 10
         * D = 10, 10, 10
         * E = 8
         */


        //Para hacer un arreglo dinamico debemos especificar unicamente la cantidad de filas
        int calificaciones[][] = new int[5][];

        //Una vez declarado nuestro arreglo, podemos asignar un nuevo arreglo a cada fila
        calificaciones[0] = new int[1]; //Alumno E con 1 calificacion
        calificaciones[1] = new int[2]; //Alumno A con 2 calificaciones
        calificaciones[2] = new int[3]; //Alumno D con 3 calificaciones
        calificaciones[3] = new int[4]; //Alumno B con 4 calificaciones
        calificaciones[4] = new int[5]; //Alumno C con 5 calificaciones

        calificaciones[0][0] = 8;

        calificaciones[1][0] = 9;
        calificaciones[1][1] = 10;

        calificaciones[2][0] = 10;
        calificaciones[2][1] = 10;
        calificaciones[2][2] = 10;

        calificaciones[3][0] = 10;
        calificaciones[3][1] = 10;
        calificaciones[3][2] = 10;
        calificaciones[3][3] = 10;

        calificaciones[4][0] = 9;
        calificaciones[4][1] = 9;
        calificaciones[4][2] = 10;
        calificaciones[4][3] = 10;
        calificaciones[4][4] = 10;

        for( int calificacionesPorAlumno[] : calificaciones){

            for (int calificacion : calificacionesPorAlumno){

                System.out.print(calificacion + " ");

            }
            System.out.println();
        }


    }
}
