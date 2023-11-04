package com.company;

public class Usuario {

    //Contructores: Un constructor inicializa un objeto durante su creacion
    //Se hace poniendo el nombre de la clase, parentesis y llaves, de la siguiente manera

    //Una vez definido el constructor, este es automaticamente ejecutaro cuando un objeto es creado
    public Usuario(String username, String password){

        this.username = username;
        this.password = password;
    }

    //Un constructor no retorna ningun valor
    //Pueden poseer los modificadores de acceso y la cantidad de patametros que necesite
    //El principal trabajo de un constructor es inicializar un objeto, es decir establecer valores por defecto

    public String username;
    private String password;

    void saludar(){

        System.out.println("Hola, mi username es " + this.username);

    }

    public String getPassword() {
        return this.password;
    }

    public  void setPassword(String password){
        this.password = password;
    }
}
