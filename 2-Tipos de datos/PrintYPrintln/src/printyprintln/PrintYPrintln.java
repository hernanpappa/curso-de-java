/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printyprintln;

/**
 *
 * @author Hernan David
 */
public class PrintYPrintln {

    
    public static void main(String[] args) {
        
        //println imprime el mensaje con un salto de linea
        
        System.out.println("Hola Mundo!");
        System.out.println("Mi nombre es Codi");
        
        //print imprime el mensaje en la misma linea
        
        System.out.print("Hola Mundo");
        System.out.print("Mi nombre es Codi \n");
        
        /**
         * 
         * Java nos provee de una secuencia de escapes que nos permiten dar formato a las cadenas de texto con las que nos encontramos trabajando.
         *        
         *   \n. Salto de línea.
         *  \t. Tabulador.
         *  \\. Diagonal inversa.
         *  \". Comillas dobles.
         *  \'. Comillas simples. 
         * 
         * */
        
        System.out.print("Hola,\nagregamos un salto");
        System.out.print("\tagregamos un tab");
        System.out.println("");

        System.out.println("Mensaje con \\ diagonal inversa");
        System.out.println("Mensaje con \" comillas dobles");
        System.out.println("Mensaje con \' comillas simples");
    }
    
}
