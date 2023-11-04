package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Metodo Default

        ClaseFinal clase = new ClaseFinal();
        clase.MostrarMensaje();

        //Al tener una interfaz metodos publicos, la clase puede hacer uso de el sin sobreescribirlos
        clase.saluda();



    }
}
