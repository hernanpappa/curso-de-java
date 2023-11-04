package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Condicionales
        //if
        //valida si algo es verdadero y en ese caso realiza el bloque de codigo que le sigue
        //en caso contrario, si se desea se puede usar un else (ejecura el bloque de codigo si ese algo es falso)

        String colorLuz = "amarillo";

        if( colorLuz.equals("verde")){
            System.out.println("Puede continuar");
        }
        else{
            System.out.println("Alto total");
        }
    }
}
