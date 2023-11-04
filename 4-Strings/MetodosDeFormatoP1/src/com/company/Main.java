package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Metodos de formato parte 1

        String mensaje = "     Hola, soy un String    ";

        //toUpperCase() pone en mayuscula el string
        System.out.println(mensaje.toUpperCase());

        //toLoweCase() pone en minuscula el string
        System.out.println(mensaje.toLowerCase());

        //trim() saca los espacios antes del primer caracter y despues del ultimo caracter
        System.out.println(mensaje.trim());

        //Es importante saber que como los metodos retornan strings pueden concatenar otros metodos
        System.out.println(mensaje.toUpperCase().trim());
        System.out.println(mensaje.toLowerCase().trim());

        System.out.println(mensaje);
    }
}
