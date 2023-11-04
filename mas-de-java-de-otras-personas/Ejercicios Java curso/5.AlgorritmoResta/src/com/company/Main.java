package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Realizar un algorritmo de resta sin utilizar la resta en si, hay que hacerla desde 0

        int num1 = 0;
        int num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        num2 = scanner.nextInt();

        scanner.close();

        if (num2 > 0) {

            while (num2 > 0) {

                num1--;
                num2--;

            }

        }else{

            while (num2 < 0) {

                num1--;
                num2++;

            }

        }


        System.out.println("El resultado de la resta es: " + num1);


    }
}
