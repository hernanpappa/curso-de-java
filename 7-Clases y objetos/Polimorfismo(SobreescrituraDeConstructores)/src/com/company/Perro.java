package com.company;

public class Perro extends Mascota {

    //Para sobreescribir un Constructor debemos de utilizar super e indicar los parametros del constructor padre
    //La sobreescritura de un constructor sera obligatoria siempre y cuando la clase padre no posea un constructor con parametros
    //SEGUNDO:Al ejecutarse el constructor, este a su vez ejecuta el constructor de la clase padre
    public Perro(String nombre, String raza, int edad){
        super(nombre, raza, edad);
    }

    @Override
    public void dormir(){
        super.dormir(); //Super => Clase padre
        System.out.println("El perro duerme!");
    }

}
