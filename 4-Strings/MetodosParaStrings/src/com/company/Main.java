package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Un metodo es una accion que puede realizar una clase
        //mensaje es un objeto de la clase String
        String mensaje = "Hola, soy un String";

        //El metodo length cuenta los caracteres del string tomando en cuenta los espacios
        int cantidad = mensaje.length();

        //El metodo contains retorna un valor booleano si mensaje contiene el string que indicamos
        boolean contiene = mensaje.contains("hola");

        //El metodo startsWith retorna un valor booleano si mensaje comienza con el string que indicamos
        boolean comienzaCon = mensaje.startsWith("Hola");

        //El metodo endsWith retorna un valor booleano si mensaje finaliza con el string que indicamos
        boolean terminaCon = mensaje.endsWith("String");

        System.out.println(cantidad);
        System.out.println(contiene);

        System.out.println(comienzaCon);
        System.out.println(terminaCon);

        //El metodo concat concatena mensaje con un string que indicamos dentro de un string
        String nuevoString = mensaje.concat(", estamos en el curso de java.");
        System.out.println(nuevoString);
    }
}
