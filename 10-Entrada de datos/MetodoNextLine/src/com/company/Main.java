package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Metodo nextLine()

        Scanner sc = new Scanner(System.in); //Scanner monitorea todo lo que pasa en consola desde que se instancia
        //hasta  que finalice el programa o lo dejemos de usar scanner con el metodo close

        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();

        System.out.println("Cual es tu Edad?");
        int edad = sc.nextInt();

        System.out.println("Cual es tu Altura?");
        float altura = sc.nextFloat();

        sc.nextLine(); //nos captura el salto de linea de next float ya que el next line de abajo toma como
        //la siguiente linea al System.out.println("el cuso es de tu agrado? (si/no)");

        //Obtenemos un booleano
        System.out.println("el curso es de tu agrado? (si/no)");
        boolean valor = sc.nextLine().equals("si"); //Esto es mas adecuado

        //sc.nextBoolean(); este metodo solo funciona cuando el usuario ingresa true o false
        //lo que limita la funcionalidad de nuestro programa

        sc.close();

        System.out.println("Hola " + nombre + " de " + edad + " anios de " + altura + " de altura " + valor);

    }
}
