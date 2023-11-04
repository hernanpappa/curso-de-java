package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Realizar un algorritmo que multiplique, otro que divida y otro que haga una potencia

        //Multiplicacion

        int num1 = 0;
        int num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        num2 = scanner.nextInt();

        int aux = num1;
        num1 = 0;
        for (int x = 0; x < num2; x++) num1 += aux;

        System.out.println("El resultado de la multiplicacion es: " + num1);

        //Division

        num1 = 0;
        num2 = 0;


        System.out.println("Ingrese el numero a dividir: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el divisor: ");
        num2 = scanner.nextInt();

        aux = 0;

        while (num1 >= num2){

            num1 -= num2;
            aux++;

        }

        System.out.println("El resultado de la division es: " + aux);

        //Potencia

        num1 = 0;
        num2 = 0;

        System.out.println("Ingrese el numero a potenciar: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese la potencia: ");
        num2 = scanner.nextInt();

        scanner.close();

        aux = num1;
        num1 = 1;
        for (int x =0; x < num2; x++) num1 *= aux;

        System.out.println("El resultado de la potencia es: " + num1);
    }
}
