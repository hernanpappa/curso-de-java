package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Como ya sabemos, podemos concatenar con el metodo concat

        String nombre = "Codi";
        String curso = "Curso de java 9";

        String mensaje = "Hola, Bienvenido ".concat(nombre);
        mensaje = mensaje.concat(" al ");
        mensaje = mensaje.concat(curso);
        mensaje = mensaje.concat(".");

        System.out.println(mensaje);

        //Pero tambien podemos concatenar usando el operador + de la siguiente mantera

        String mensaje2 = "Hola, Bienvenido " + nombre + " al " + curso + ".";
        System.out.println(mensaje2);
    }
}
