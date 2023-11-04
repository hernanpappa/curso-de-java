package com.company;

//Dentro de las interfaces podemos definir metodos default:
// no son metodos abstractos, poseen un cuerpo y un comportamiento

public interface InterfaceB {
    public abstract void MostrarMensaje();

    //De esta manera implementamos el metodo default
    //Al tener un metodo default no sera necesario que la clase lo implemente
    public default void saluda(){
        System.out.println("Hola mundo, desde una interfaz");
    }

}
