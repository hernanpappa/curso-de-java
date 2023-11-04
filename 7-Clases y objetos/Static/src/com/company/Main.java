package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Circulo c = new Circulo(1f);

        //Aca estamos haciendo uso del atributo estatico pi
        System.out.println( Circulo.pi);
        System.out.println( c.pi);
        System.out.println(c.area());


    }
}
