package com.company;

public class Calculadora {

    //Sobrecarga de metodos: Es  la posibilidad que tiene un lenguaje de programacion para definir
    //dos o mas metodos con el mismo nombre en la misma clase

    //Sirve para tener comportamientos distintos.

    //Para que halla sobrearga de metodos debemos de hacer metodos con el mismo nombre
    //pero con distintos parametros.

    //Enteros
    public int suma(int valor1, int valor2){
        return valor1 + valor2;
    }

    public int suma(int valor1, int valor2, int valor3){
        return valor1 + valor2 + valor3;
    }

    public int suma(){
        return 0;
    }

    //flotantes
    public float suma(float valor1, float valor2){
        return valor1 + valor2;
    }

    //doubles
    public double suma(double valor1, double valor2){
        return valor1 + valor2;
    }

}
