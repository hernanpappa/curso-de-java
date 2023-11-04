package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Clases y objetos
        //Una clase es un molde que posee atributos (variables) y metodos (funciones) propios
        //Un objeto es una instancia de un molde, lo que quiere decir que toma los atributos y los metodos
        //de una clase y actua en funcion de los valores que posean sus atributos

        Perro lassie = new Perro(); //lassie es una instancia de Perro

        //Asignamos valores a los atributos de lassie

        lassie.nombre = "Lassie";
        lassie.raza = "Collie";
        lassie.edad = 4;

        System.out.println("El nombre es :  " + lassie.nombre );
        System.out.println("La raza es :  " + lassie.raza );
        System.out.println("La edad es :  " + lassie.edad );

    }
}
