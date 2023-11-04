package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Realizo una instancia de Usuario(el objeto) y se ejecuta nuestro constructor
        Usuario codi = new Usuario("Codi", "pass");

        //Como ahora nuestro constructor asigna valores a los atributos
        //Estas dos lineas de codigo ya no son necesarias
        //codi.username = "Codi";
        //codi.setPassword("pass");

        System.out.println(codi.username);
        System.out.println(codi.getPassword());

        codi.saludar();
    }
}
