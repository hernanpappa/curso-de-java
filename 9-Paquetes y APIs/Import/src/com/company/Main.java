package com.company;

//el import funciona para importar una clase o api(clase externa)
import com.pappa.ClaseDavid;
import com.pappa.*; //si usamos * estamos importando todas las clases dentro de la ubicacion(en este caso com.pappa)

public class Main {

    public static void main(String[] args) {
	// write your code here

        ClaseDavid clase = new ClaseDavid("El joker lo hiso de nuevo");
        clase.ObtenerMensaje();

    }
}
