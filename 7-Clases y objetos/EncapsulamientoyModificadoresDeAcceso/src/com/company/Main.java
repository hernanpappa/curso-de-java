package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Este codigo no anda porque explica modificadores de acceso
        // para ver el que anda ir al tema que sigue ya que le corresponde, getter y setter
        Usuario codi = new Usuario();
        codi.username = "Codi";
        codi.password = "pass";

        System.out.println(codi.username);
        System.out.println(codi.password);

        codi.saludar();
    }
}
