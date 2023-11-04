package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Recorrer arreglos

        int calificaciones[] = { 9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
        int suma = 0;

        //vamos a sacar el promedio de calificaciones: sum / cantidad
        //para saber la longitud del arreglo podemos hacer uso del metodo length

        System.out.println(calificaciones.length); //La salida da 10

        //Por lo tanto al tener 10 datos podemos usar los indices del 0 al 9

        //El for va a ejecutarse mientras indice sea menor a la longitud del arreglo
        for( int indice = 0; indice < calificaciones.length; indice++){

            suma += calificaciones[indice];

        }

        float promedio = suma / calificaciones.length;
        System.out.println("El promedio es " + promedio);

    }
}
