package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Crear un matriz de 5 x 5

        int matriz[][] = new int[5][5];

        //Llenar la matriz con números aleatorios.
        //Para obtener un número aleatorio en Java podemos hacer uso de la siguiente sentencia.
        //int numero = (int)(Math.random() * 100);

        for(int x = 0; x < 5; x++) {

            for (int y = 0; y < 5; y++) {

                matriz[x][y] = (int)(Math.random() * 100);

            }

        }

        //A partir de la matriz anteriormente creada:

        //Mostrar en consola el promedio de la matriz.

        int suma = 0;
        for(int x = 0; x < 5; x++) {

            for (int y = 0; y < 5; y++) {

                suma += matriz[x][y];

            }

        }
        System.out.println("La suma de la matriz es " + suma);
        System.out.println();

        //Mostrar en consola el número mayor y la cantidad de veces que este se repite.

        int mayor = 0;
        int mayorVeces = 0;

        for( int arreglo[] : matriz ){

            for( int numero : arreglo){

                if(numero > mayor){

                    mayor = numero;

                }

            }

        }

        for( int arreglo[] : matriz ){

            for( int numero : arreglo){

                if(numero == mayor){

                    mayorVeces++;

                }

            }

        }


        System.out.println("El numero mayor es: " + mayor);
        System.out.println("Se repite: " + mayorVeces);
        System.out.println();

        //Mostrar en consola todos los números primos.


        for(int arreglo[] : matriz){

            for( int numero : arreglo){

                int contador = 2;
                boolean primo = true;

                while ((primo) && (contador!=numero)){

                    if(numero % contador == 0){

                        primo = false;

                    }
                    contador++;
                }

                if(primo){

                    System.out.println("Numero primo encontrado: " + numero);

                }

            }

        }
        System.out.println();

        //Mostrar en consola todos los números pares.

        for(int arreglo[] : matriz){

            for( int numero : arreglo){

                boolean par = false;

                if(numero % 2 == 0) par = true;

                if(par){

                    System.out.println("Numero par encontrado: " + numero);

                }

            }

        }
        System.out.println();

        //Mostrar en consola la suma de las diagonales

        int sumaDiagonales = 0;

        sumaDiagonales += matriz[0][0];
        sumaDiagonales += matriz[1][1];
        sumaDiagonales += matriz[2][2];
        sumaDiagonales += matriz[3][3];
        sumaDiagonales += matriz[4][4];

        System.out.println("La suma de las diagonales es: " + sumaDiagonales);

        //Mostrar en consola la suma de la la última fila.

        int sumaUltimaFila = 0;

        for (int numero : matriz[4]){

            sumaUltimaFila += numero;

        }
        System.out.println("La suma de la ultima fila es: " + sumaUltimaFila);

        //Mostrar en consola el mensaje "Cuadrado Mágico" si la matriz cataloga como un cuadrado mágico.



    }
}
