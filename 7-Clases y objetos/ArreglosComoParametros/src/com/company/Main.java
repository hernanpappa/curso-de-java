package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //En Java nosotros podemos trabajar con métodos los cuales reciban como parámetros arreglos.

        /**
         * public static void showElements(String[] array) {
         *
         *             for(String sentencia : array)
         *                 System.out.println(sentencia);
         *         }
         */

        //En este caso tenemos un método estático (método de clase) el cual recibe
        // como parámetros un arreglo de Strings.

        //El arreglo como parámetros seguirá la siguiente estructura.

        //Tipo dato [] nombre parámetros
        //ejemplo

        //String[] array
        //Para hacer uso de este método, únicamente debemos de hacer uso de la clase
        // y colocar como argumento un arreglo.

        //String elements[] = { "a", "e", "i", "o", "u"};
        //Class.showElements(elements);
        //Algo interesante a mencionar es que nuestra clase principal en su método
        //estático main, recibe como parámetros un arreglo de Strings, arreglo que no
        //será más que los argumentos que nosotros coloquemos al ejecutar nuestro programa.
    }
}
