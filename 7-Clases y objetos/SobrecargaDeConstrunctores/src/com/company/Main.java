package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("Usuario2");
        Usuario usuario3 = new Usuario("Usuario3", "Password");

        usuario1.saludar();
        usuario2.saludar();
        usuario3.saludar();


    }
}
