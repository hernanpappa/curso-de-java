package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /**
         * Listado de ejemplos sobre el método format de la clase String.
         *
         * Recordemos que el método format retornar un nuevo String.
         * Si nosotros únicamente mostraremos en consola el nuevo
         * String podemos optar por usar el método printf
         *
         * System.out.printf(formato, valores);
         */

        //Strings

        String nombre = "Codi";
        String apellido = "Facilito";

        String nombreCompleto = String.format("%s %s", nombre, apellido);
        System.out.println(nombreCompleto);

        //Enteros

        String resultado = String.format("%d - %d - %d", 10, 20, 30);
        System.out.println(resultado);

        //Float

        float pi = 3.14159265359f;

        String resultado1 = String.format("%f - Decimales: %.2f", pi, pi);
        System.out.println(resultado1);

        //Boolean

        int cantidad = 10;
        boolean mayor = cantidad > 5;

        String resultado2 = String.format("La cantidad es mayor a %d : %b", cantidad, mayor);
        System.out.println(resultado2);

        //Orden

        /**
         * El reemplazo de los valores es lineal, sin embargo,
         * habrá ocasiones en las cuales nosotros necesitemos
         * especificar el orden, en esos casos seguiremos la
         * siguiente estructura %, posición, $, tipo
         */

        String uno = "Uno";
        String dos = "Dos";
        String tres = "Tres";

        String resultado3 = String.format("%3$s - %2$s - %1$s",
                uno, dos, tres);
        System.out.println(resultado3);
        float pi2 = 3.14159265359f;

        String resultado4 = String.format("%1f - Decimales: %1$.2f", pi2, pi2);
        System.out.println(resultado4);
    }
}
