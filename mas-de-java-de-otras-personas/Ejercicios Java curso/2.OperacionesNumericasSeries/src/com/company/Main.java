package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Hacer una serie de numeros con la cantidad de numeros que el usuario pida. La serie comenzara
        //en 1 e ira sumando 4 y restando 2 sucesivamente. Ejempl: 1, 5, 3, 7, 5, 9, 7, 11, 9, 13, etc...

        boolean sumar = true;
        int numero = 1;
        int cantidad = 0;
        int contador = 0;

        System.out.println("Bienvenido usuario. Usted visualizara una serie de numeros");
        System.out.println("Cuantos numeros desea ver?");

        Scanner scanner = new Scanner(System.in);
        cantidad = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.print("Serie: ");

        do {

            System.out.print(numero + " ");

            if(sumar){

                numero += 4;
                sumar = false;

            }else{

                numero -= 2;
                sumar = true;

            }
            contador++;

        }while (contador < cantidad);




    }
}
