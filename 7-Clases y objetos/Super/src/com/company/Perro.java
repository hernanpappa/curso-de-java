package com.company;

public class Perro extends Mascota {

    public Perro(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;

    }

    //Super: nos permite sobreescribir metodos conservando las funcionalidades de la clase padre
    //de tal manera que las clases hijas y sus metodos sean mas robustas
    //Super.metodo() ejecuta las funciones del metodo de la clase padre

    @Override
    public void dormir(){
        super.dormir(); //Super => Clase padre
        System.out.println("El perro duerme!");
    }

}
