package com.company;

public abstract class Figura {

    /**
     * Clases Abstractas: Las clases astractas son clases padres con caracteristicas muy generales
     * y sus clases hijas son las que definen los detalles. La principal diferencia con las clases normales
     * es que una clase abstracta posee por lo menos un metodo abstracto. Las clases abstractas pueden ser
     * heredadas por otras clases pero no pueden ser instanciadas.
     */


    //Metodo abstracto: Es aquel que no posee un cuerpo, define que hacer pero no como.Ejemplo:

    private int numeroLados;

    public Figura(){
        this.numeroLados = 0;
    }

    //Cada figuta posee una formula matemarica diferente para sacar el area. Para definir un metodo abstracto
    //debemos eliminar su cuerpo, luego  usar abstract despues del MDA

    public abstract float area(); //Metodo abstracto => debe estar dentro de una clase abstracta

}
