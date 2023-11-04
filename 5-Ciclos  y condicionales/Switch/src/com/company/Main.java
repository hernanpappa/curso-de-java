package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Switch: no necesariamente  debe evaluar un booleano como if
        //Puede evaluar cualquier tipo de dato

        String color = "Rosa";

        switch (color){

            //los case a evaluar deben ser del mismo tipo que se evalua en el switch
            //No vamos a usar llaves, usamos dos puntos, lo que quiere decir que los case no es un bloque
            //Podemos usar los case que queramos
            //El orden de comprobacion es descendente
            case "Verde":

                System.out.println("Puede continuar");
                break; //Es una palabra reservado y lo que hace es terminar un flujo como el switch

            case "Amarillo":

                System.out.println("Alto parcial");
                break;

            case "Rojo":

                System.out.println("Alto Total");
                break;

            //El defaul se utiliza para ejecutar el codigo que queramos en caso de que
            //ningun case sea verdadero
            default:

                System.out.println("Color no valido");
                break;
        }

        char calificacion = 'B';

        switch (calificacion){

            case 'A':
                System.out.println("Excelente!");
                break;

            /**
             * Cuando tenemos dos case en los que ambos realizan la misma accion
             * Tenemos el problema de que aun podemos mejorar mas nuestro programa
             * Debido a que los case no son bloques de codigo, las validaciones y sus
             * posteriores lineas de codigo se ejecutaran hasta encontrar un break
             *
             *
             *             case 'B':
             *                 System.out.println("Bien hecho!");
             *                 break;
             *
             *             case 'C':
             *                 System.out.println("Bien hecho!");
             *                 break;
             *
             * Para casos como este en el que dos case realicen la misma accion
             * podemos realizar lo siguiente
             */

            case 'B':
            case 'C':
                System.out.println("Bien hecho!");
                break;

            //De esta manera podemos comprobar 2 case y realizar una misma accion

            case 'D':
                System.out.println("Aprobado!");
                break;

            case 'E':
                System.out.println("Puedes mejorar!");
                break;

            case 'F':
                System.out.println("F!");
                break;

            default:
                System.out.println("Calificacion no valida");
                break;
        }
    }
}
