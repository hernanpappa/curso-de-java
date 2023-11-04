package com.company;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //La clase J Option Pane es otra forma de obtener datos del teclado. Nos provee una interaz grafica

        String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre?");
        //Este metodo nos mostrara una ventana y nos pedira un input, que aqui lo guardaremos en nombre

        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es tu edad?"));
        //Para que nos devuelva variables que no sean Strings debemos de convertirlas al tipo necesario

        String mensaje = "Hola " + nombre + " con una edad de " + edad;
        JOptionPane.showMessageDialog(null, mensaje);
        //Con este metodo mostramos un mensaje

    }
}
