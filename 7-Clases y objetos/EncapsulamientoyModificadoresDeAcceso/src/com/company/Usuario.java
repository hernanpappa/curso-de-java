package com.company;

public class Usuario {

    //El encapsulamiento busca la forma de controlar el acceso de los datos que conforma un objeto
    //o una instancia de tal forma que se provea de una capa de seguridad

    //Los modificadores de acceso permiten dar un nivel de seguridad mayor a nuestras aplicaciones
    //restringiendo el acceso de diferentes atributos, metodos y constructores

    //Modificadores de acceso(MDA):

    //Default: es el MDA por defecto(Sin especificar)
    //cualquier clase o objeto del mismo paquete puede hacer uso del atributo o metodo que posea este MDA

    //Public: debe especificarse al atributo o metodo que queremos que sea publico con la palabra public
    //Cualquier otro objeto o clase del mismo o de otro paquete podra hacer uso de dicho elemento

    //Private: debe especificase al atributo o metodo que queremos hacer privado con la palabra private
    //Los elementos que posean este MDA solo pueden ser usados dentro de la misma clase

    //Protected

    public String username;
    private String password;

    void saludar(){

        System.out.println("Hola, mi username es " + this.username);

    }


}