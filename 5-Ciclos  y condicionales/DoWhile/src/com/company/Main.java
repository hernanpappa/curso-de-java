package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //do while
        //El ciclo do while nos permitira ejecutar un bloque de comandos de forma
        // repetida hasta que una condicion deje de cumplirse.
        // A diferencia de while, do while debe ejecutarse por lo menos una vez
        //En el ciclo while primero se evalua la condicion y despues se ejeuta el bloque de comandos
        //En do while primero se ejecuta el bloque de comandos y despues se evalua la condicion

        int contador = 10;

        do{

            System.out.println(contador);
            contador++;

        }while ( contador < 10);
    }
}
