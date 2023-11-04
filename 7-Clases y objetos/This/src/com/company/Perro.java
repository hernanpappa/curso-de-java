package com.company;

public class Perro {

    String nombre;
    String raza;
    int edad;

    void comer(){
        System.out.println("El perro se encuentra comiendo!");
    }

    void dormir(){
        System.out.println("El perro se encuentra dormido!");
    }

    void ladrar(){
        System.out.println("El perro se encuentra ladrando!");
    }

    //This
    //Nos sirve para hacer referencia al mismo objeto para acceder a atributos y otros metodos

    //Metodo
    void establecerParametros(String nombre, String raza, int edad){

        //this hace referencia al objeto

        //this.nombre es el atributo del objeto y nombre es el parametro nombre
        this.nombre = nombre;
        //Y asi con las siguientes lineas de codigo
        this.raza = raza;
        this.edad = edad;

    }

}
