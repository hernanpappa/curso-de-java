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
        int edad = Integer.parseInt(sc.nextLine()); //Integer.parseInt convierte el string en int
        //Tambien podemos usar el metodo nextInt();
        System.out.println("Cual es tu Edad?");
        edad = sc.nextInt();

        //Obtenemos un dato float
        System.out.println("Cual es tu Altura?");
        float altura = sc.nextFloat();

        //Obtenemos un booleano
        System.out.println("el curso es de tu agrado?");
        boolean valor = sc.nextBoolean();

        System.out.println("Hola " + nombre + " de " + edad + " anios de " + altura + " de altura " + valor);

    }
}
