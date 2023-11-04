package com.company;
//Para implementar multiples interfaces debemos de usar implements y las interfaces separadas por coma
public class PastorAleman implements Canino, Mascota {

    @Override
    public void aullar() {
        System.out.println("El pastor aleman aulla");
    }
}
