package com.company;

public class Calculadora {

    //Multiples parametros: sirve para hacer un metodo con multiples parametros cuando no conocemos su cantidad
    //O necesitamos una n cantidad de parametros muy grande

    //Cuando declaramos multiples parametros lo hacemos de la siguiente manera:

    public int suma(int... numeros){
        //numeros tiene n cantidad de ints, lo que lo hace nada mas y nada
        // menos que un arreglo sin espacios limitados

        int suma = 0;
        for( int numero : numeros){

            suma += numero;

        }
        return suma;

    }

    public float suma(float... numeros){


        float suma = 0;
        for( float numero : numeros){

            suma += numero;

        }
        return suma;

    }

    public double suma(double... numeros){
        //numeros tiene n cantidad de ints, lo que lo hace nada mas y nada
        // menos que un arreglo sin espacios limitados

        double suma = 0;
        for( double numero : numeros){

            suma += numero;

        }
        return suma;

    }





}
