package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Clase scanner: nos permite obtener datos de lo que el usuario escribe. Esta clase esta en el
        //paquete java.util asique debemos de importarlo. Para usar Scanner debemos de crear una instancia

        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();

        System.out.println("Cual es tu Edad?");
        String edad = sc.nextLine();

        System.out.println("Hola " + nombre + " de " + edad + " anios de edad no tengo enie");

    }
}
