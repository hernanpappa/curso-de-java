package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Realizar un algorritmo de suma sin hacer la suma directa de ellos y sin usar una variable que lo guarde

        int num1 = 0;
        int num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        num2 = scanner.nextInt();

        scanner.close();

        while (num2 > 0){

            num1++;
            num2--;

        }

        System.out.println("El resultado de la suma es: " + num1);

    }
}
