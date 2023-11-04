package com.company;

public class Mascota {

    //En este caso Mascota sera la clase general para representar a Perro y Gato como si fuera la vida real
    //Mascota sera la clase padre y le heredara sus metodos y atributos a sus hijos

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
