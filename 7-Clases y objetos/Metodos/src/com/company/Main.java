package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Metodos
        //Los metodos son acciones que tienen las clases

        Perro lassie = new Perro(); //lassie es una instancia de Perro

        //Asignamos valores a los atributos de lassie

        lassie.nombre = "Lassie";
        lassie.raza = "Collie";
        lassie.edad = 4;

        System.out.println("El nombre es :  " + lassie.nombre );
        System.out.println("La raza es :  " + lassie.raza );
        System.out.println("La edad es :  " + lassie.edad );

        lassie.comer();
        lassie.dormir();
        lassie.ladrar();

    }
}
