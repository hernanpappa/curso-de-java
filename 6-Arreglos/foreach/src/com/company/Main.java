package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //foreach
        //Nos permite recorrer los elementos de una coleccion, como un arreglo
        //En cada iteracion el foreach nos permitira obtener el valor de cada indice de un arreglo

        int calificaciones[] = { 9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
        int suma = 0;

        //Debemos declarar una variable del mismo tipo a la que vamos a recorrer, poner : y la valiable a recorrer
        for( int calificacion : calificaciones ){

            suma += calificacion;

        }

        float promedio = suma / calificaciones.length;
        System.out.println("El promedio es " + promedio);
    }
}
