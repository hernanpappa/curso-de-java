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

    //nombrePerro es un parametro
    //podemos poner la n cantidad de parametros que queramos poniendo coma entre ellos
    void establecerParametros(String nombrePerro, String razaPerro, int edadPerro){

        nombre = nombrePerro;
        raza = razaPerro;
        edad = edadPerro;

    }

}
