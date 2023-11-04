package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Parametros
        //Los parametros son los valores que asignamos a los metodos

        Perro lassie = new Perro();

        //Los valores que utilicemos al llamar a un metodo que posee parametros lo llamaremos argumentos
        //Este metodo posee 3 parametros, asique necesitamos 3 argumentos

        lassie.establecerParametros("Lassie", "Collie", 4);

        System.out.println("El nombre es :  " + lassie.nombre );
        System.out.println("La raza es :  " + lassie.raza );
        System.out.println("La edad es :  " + lassie.edad );

        lassie.comer();
        lassie.dormir();
        lassie.ladrar();

    }
}
