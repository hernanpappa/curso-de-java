package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //equals es un metodo que compara strings y devuelve un valor booleano si son completamente iguales
        //toma en cuenta espacios, mayusculas, minusculas, todoo

        String cadena1 = "Hola";
        String cadena2 = "hola";

        boolean resultado = cadena1.equals(cadena2);
        System.out.println(resultado);

        //Si queremos validar solo el texto podemos estandarizar los strings y compararlos

        String nuevaCadena1 = cadena1.toUpperCase();
        String nuevaCadena2 = cadena2.toUpperCase();

        resultado = nuevaCadena1.equals(nuevaCadena2);
        System.out.println(resultado);

        //Esas 4 lineas se pueden reducir a 2 ya que podemos concatenar metodos en los objetos string

        resultado = cadena1.toUpperCase().equals(cadena2.toUpperCase());
        System.out.println(resultado);

        //Aunque tambien podemos hacer uso del metodo equalsIgnoreCase en vez de estandarizar los strings
        //Este metodo compara las cadenas de texto ignorando las mayusculas o minusculas

        resultado = cadena1.equalsIgnoreCase(cadena2);
        System.out.println(resultado);
    }
}
