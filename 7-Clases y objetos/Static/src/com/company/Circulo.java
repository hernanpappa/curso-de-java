package com.company;

public class Circulo {

    //Static sirve para que los atributos o metodos puedan ser invocardos o utilizados
    //sin la necesidad de instanciar un nuevo objeto.
    //Static se agrega luego del modificador de acceso
    //Los elementos que no sean estaticos los conoceremos como elementos de instancia

    public static final float pi = 3.1415926535f; //pi pertenece a la clase ahora y no al objeto
    public float radio  = 0f; //radio es un atributo de instancia

    public Circulo(float radio){
        this.radio = radio;
    }

    public float area(){  //area es un metodo de la instancia
        return pi * (radio * radio);
    }

    /*public static float area(){  //area aora es estatico y le pertenece al objeto y no a la instancia
        return pi * (radio * radio); //como radio le pertenece a la instancia y no a la clase, area no puede usarlo
    }*/

    public static float area(float radio){  //para solucionarlo podemos agregar un parametro
        return pi * (radio * radio);
    }

}
