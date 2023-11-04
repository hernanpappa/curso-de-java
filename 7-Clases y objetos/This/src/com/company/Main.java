package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //This
        //Ver en class Perro(

        Perro lassie = new Perro();



        lassie.establecerParametros("Lassie", "Collie", 4);

        System.out.println("El nombre es :  " + lassie.nombre );
        System.out.println("La raza es :  " + lassie.raza );
        System.out.println("La edad es :  " + lassie.edad );

        lassie.comer();
        lassie.dormir();
        lassie.ladrar();

    }
}
