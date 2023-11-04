package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /**
         * Herencia: La herencia nos permite crear nuevas clases a partir de clases ya existentes pero
         * con algunas adiciones o cambios. Estas clases (llamadas clase hijo) heredan los metodos y atributos
         * de su clase padre. La herencia nos permitira tener concentradas en una clase padre Atributos
         * y metodos de uso comun heredadas a sus clases hijas  para no repetir codigo innecesariamente
         */

        Gato gato = new Gato("gato" ,"raza", 12);
        Perro perro = new Perro("perro", "raza", 15);

        gato.dormir();
        perro.dormir();

    }
}
