package com.company;

//Siempre que heredemos de una clase abstracta debemos implementar todos sus
//metodos abstractos, es decir, definir su comportamiento. Simplemente debemos sobreescribir los metodos
public class Triangulo extends Figura {

    private float base;
    private float altura;

    @Override
    public float area() {
        return (base * altura) / 2;
    }
}
