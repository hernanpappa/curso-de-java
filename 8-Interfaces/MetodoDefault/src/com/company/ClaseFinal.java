package com.company;

public class ClaseFinal implements InterfaceA {

    //Al tener un metodo default en la interfaz no sera necesario que la clase lo implemente a no ser que
    //se quiera sobreescribir. El metodo saluda no requiere sobreescritura
    @Override
    public void MostrarMensaje() {
        System.out.println("Hola");
    }
}
