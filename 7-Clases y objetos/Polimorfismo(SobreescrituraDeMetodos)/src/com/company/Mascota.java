package com.company;

public class Mascota {

    /**
     * Sobreescritura de metodos(Polimorfismo): es tomar un metodo de la
     * clase padre y hacer que la clase hija la implemente de otra forma
     * Pata hacer esto debemos ir a la clase hija
     */

    public String nombre;
    public String raza;
    public int edad;

    public void dormir() {
        System.out.println("La mascota esta durmiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
