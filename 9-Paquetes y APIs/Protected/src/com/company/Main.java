package com.company;

import com.pappa.ClaseDavid;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Protected: es un MDA que nos permite proteger a una clase o metodo para que no accedan
        // desde otro paquete que no sea al que pertenece


        ClaseDavid clase = new ClaseDavid("El joker lo hiso de nuevo");
        clase.ObtenerMensaje(); //Como vemos nos sale un error porque el metodo esta protegido

    }
}
