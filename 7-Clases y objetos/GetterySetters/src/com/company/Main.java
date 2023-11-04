package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Usuario codi = new Usuario();
        codi.username = "Codi";

        //Establecemos su valor
        codi.setPassword("pass");

        System.out.println(codi.username);

        //Obtenemos su valor
        System.out.println(codi.getPassword());

        codi.saludar();
    }
}
