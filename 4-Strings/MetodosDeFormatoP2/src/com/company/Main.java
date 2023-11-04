package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //format esta dentro de la clase String
        //format es un metodo que da formato a un string
        //format retorna un nuevo string

        String mensaje;
        String curso = "java";

        //%s es reemplazado por el string curso
        mensaje = String.format("Bienvenido al curso de %s", curso);
        System.out.println(mensaje);

        float valor = 10.872040f;

        //en este caso format le da formato a mensaje con hasta 2 decimales del numero valor
        //%.(un numero)f reemplaza un flotante con esa cantidad de decimales
        mensaje = String.format("%.2f", valor);
        System.out.println(mensaje);

        //en este caso format le da formato a mensaje con hasta 4 decimales del numero valor
        mensaje = String.format("%.4f", valor);
        System.out.println(mensaje);

        //%d reemplaza un numero entero
        mensaje = String.format("El total de %d articulos es %.4f %s", 3, valor, "mx");
        System.out.println(mensaje);

        //En vez de usar un string y el metodo format para dar formato, podemos usar directamente un printf
        //printf = print format
        System.out.printf("El total de %d articulos es %.4f %s", 3, valor, "mx");


    }
}
