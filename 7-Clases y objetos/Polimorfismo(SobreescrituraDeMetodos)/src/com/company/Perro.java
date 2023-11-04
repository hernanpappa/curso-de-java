package com.company;

public class Perro extends Mascota {

    public Perro(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;

    }

    //De esta manera sobreescribimos un metodo de la clase padre y modificamos su comportamiento

    @Override //Indica que es un metodo sobreescrito
    public void dormir(){
        System.out.println("El perro duerme!");
    }

}
