package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Calcular el factorial de un numero. El factorial de un numero es el resultado de multiplicar
        // 1*2*3*4... hasta llegar a ese numero. Ejemplo con 5 = 1*2*3*4*5 = 120

        System.out.println("Que factorial desea saber?");

        Scanner scanner = new Scanner(System.in);
        int numero = Integer.parseInt(scanner.nextLine());
        int factorial = 1;

        System.out.println();

        for (int i = 1; i <= numero; i++ ) factorial *= i;

        System.out.println("El factorial de su numero es: " + factorial);


    }
}
