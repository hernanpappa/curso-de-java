package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //El scope o alcance es el alcance que tiene una variable dentro del programa
        //Cada bloque de codigo comienza con las llaves {}
        //Cada bloque de codigo define un nuevo alcance
        //Una variable no puede ser utilizada fuera de su alcance

        int promedio = 9;

        if (promedio >= 7 ){
            String mensaje = "Felicidades! Tu promedio es de: " + promedio;

            if (promedio == 10){

                System.out.println(mensaje);
                String mensajeDos = "Nuevo mensaje";
                if (true){
                    //mensajeDos puede ser usado aqui
                    System.out.println(mensajeDos);
                }

            }
            mensaje = "iji au"; //mensaje puede ser usado aqui
            mensaje2 = "hola"; // Pero mensajeDos no puede ser usado fuera de su alcance
        }
        mensaje = "Che no me podes usar aca";
    }
}
