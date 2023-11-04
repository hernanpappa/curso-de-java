package com.company;

public class Usuario {

    //Getter y Setter: permiten obtener y modificar datos privados dentro de una clase

    //Getter: retorna el valor de un atributo
    //Setter: Establece un valor a un atributo

    public String username;
    private String password;

    void saludar(){

        System.out.println("Hola, mi username es " + this.username);

    }

    //Getter: con este metodo otras clases y objetos podran hacer
    // uso del atributo password sin acceder directamente a el

    public String getPassword() {
        return this.password;
    }

    //Setter:con este metodo otras clases y objetos podran establecer
    //un valor al atributo sin acceder directamente a el

    public  void setPassword(String password){
        this.password = password;
    }
}
