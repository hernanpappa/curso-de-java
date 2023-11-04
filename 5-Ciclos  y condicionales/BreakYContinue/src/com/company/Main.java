package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //break and continue
        //Sentencias de salto: break, continue y return

        //break nos permite terminar una secuencia de instrucciones
        //break nos permite salir de un ciclo
        //break puede ser utilizada como una foma civilidaza de usar goto
        int valor = 10;

        switch (valor){
            case 10:
                System.out.println("Es 10");
                break;

            default:
                System.out.println("No es 10");
        }

        for(int x = 1; x < 101; x++ ){

            if(x == 50){
                break;
            }
            System.out.println(x);
        }
        System.out.println("Ciclo completado!");

        //continue lo usaremos dentro de ciclos
        //continue nos permitira que el ciclo salte a la siguiente iteracion
        // (salta a la proxima vuelta) o (Omite la vuelta actual, omite el codigo que sigue de la actual iteracion)

        for (int x = 0 ; x < 10; x++ ){

            if(x == 5){
                continue;
            }
            System.out.println(x);
        }
        //Como vemos al ejecutar el codigo el numero 5 se omite
    }
}
