package com.company;

public class Usuario {

    //Sobrecarga de constructores
    //Al igual que los metodos, los constructores pueden sobrecarcarse

    public Usuario(){

        this.username = "";
        this.password = "";
    }

    public Usuario(String username){

        this.username = username;
        this.password = "";
    }

    public Usuario(String username, String password){

        this.username = username;
        this.password = password;
    }

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
