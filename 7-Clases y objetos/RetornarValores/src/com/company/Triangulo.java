package com.company;

public class Triangulo {

    float base;
    float altura;


    //Si vamos a retornar un valor de un metodo, este metodo debe ser del mismo tipo que del valor a retornar
    float area(){

        float area = (this.base * this.altura) / 2;

        //return devuelve el valor area
        return area;
    }

}
