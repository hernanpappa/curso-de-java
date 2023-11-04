package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //else if es una validacion if despues de comprobar que la anterior es falsa
        String color = "rojo";

        if (color.equals("verde")){
            System.out.println("Puede pasar");
        }
        else if(color.equals("amarillo")){
            System.out.println("Alto parcial");
        }
        else if(color.equals("rojo")){
            System.out.println("Alto total");
        }
    }
}
