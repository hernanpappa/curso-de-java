package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //condiciones anidadas (un if dentro de un if)

        int promedio = 9;

        if(promedio >= 7){

            //Este es un if anidado
            if(promedio == 10){

                System.out.println("Muchas felicidades");

            }else{

                System.out.println("Felicidades");

            }

        }
        else {
            System.out.println("Necesitas repasar");
        }
    }
}
