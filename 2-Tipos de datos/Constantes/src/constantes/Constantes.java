/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constantes;

/**
 *
 * @author Hernan David
 */
public class Constantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Una constante es una variable que no cambia durante todo el programa
        //Una constante se utiliza para valores que no deban de cambiar, como el puerto de una base de datos
        //Se decalra con la palabra reservada final
        
        final float pi;
        pi = 3.1415f; //La constante puede asignarse una sola vez en todo el programa;
        
        System.out.println(pi);
    }
    
}
