package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Sobre escritura de Constructor

        //PASOS DEL FLUJO DE DATOS
        //PRIMERO: Al momento de instanciar un objeto, se ejecuta el constructor(ver este)
        Gato gato = new Gato("gato" ,"raza", 12);
        Perro perro = new Perro("perro", "raza", 15);

        System.out.println(perro.getNombre());
        System.out.println(gato.getNombre());

    }
}
