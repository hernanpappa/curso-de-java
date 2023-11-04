package com.company;

public class Usuario {

    /**
     * Clases anidadas: es una clase dentro de otra clase. Esta clase puede tener
     * atributos, metodos, constructores, etc al igual que cualquier clase. Una clase anidada
     * puede acceder a los atributos de las clases a las que pertenecen. Ejemplo:
     */

    public String username;

    public Usuario(String username){
        this.username = username;
    }

    public void  establecerRol(){

        Administrador admin = new Administrador();
        admin.trabajar();

    }

    public class Administrador{

        public  void trabajar(){
            System.out.println("El administrador " + username + " esta trabajando!");
        }
    }
}
