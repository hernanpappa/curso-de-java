package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Sobreescritura de metodos

        Gato gato = new Gato("gato" ,"raza", 12);
        Perro perro = new Perro("perro", "raza", 15);

        gato.dormir();

        //El metodo dormir primero se busca en la clase de la instancia, luego en el padre,
        // luego en el abuelo y asi de forma ascendente
        perro.dormir();

    }
}
