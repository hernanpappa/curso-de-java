package com.company;

public class Mascota {


    public String nombre;
    public String raza;
    public int edad;

    //Para sobreescribit un constructor, la clase padre debe poseerlo

    //TERCERO: El constructor padre lo que hace es asignar valores a los atributos
    public Mascota(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;

    }

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
