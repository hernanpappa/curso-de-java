/*
 Un vendedor de autos gana 1000 al mes, mas 150 por auto vendido mas el 5% del valor del auto
 */
package vendedordeautos;

import java.util.Scanner;

public class VendedorDeAutos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float total = 1000;
        int vendidos;
        
        System.out.print("Cuantos autos vendio el vendedor? ");
        vendidos = scan.nextInt();//esta variable guarda el total de autos vendidos
        
        int[] valor = new int[vendidos]; //creamos un vector de enteros donde se guarda el valor de los autos vendidos
        
        for (int i = 0; i < vendidos ; i++){
            System.out.print("\n\n Ingrese el valor del auto vendido nro "+(i+1)/*pongo i+1 para que empiece desde 1 cuando lo muestra por pantalla*/+":");
            valor[i] = scan.nextInt();//se va guardando cada valor en la pocision del vector que le corresponde
            
            total += 150 + ((valor[i] / 100) * 5); //se suma 150 + el 5% del valor del auto
        }
        
        System.out.println("\n\n El total a cobrar es de "+total+" pesos");
        
    }
    
}
