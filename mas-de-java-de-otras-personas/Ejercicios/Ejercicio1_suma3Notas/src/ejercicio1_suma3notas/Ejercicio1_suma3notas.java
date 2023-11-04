package ejercicio1_suma3notas;
//obtiene el promedio de 3 notas

import java.util.Scanner;

public class Ejercicio1_suma3notas {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] n = new float[3];//asi es como se declaran los arreglos en java
        int r;
        
        for (int i = 0; i <3 ; i++){
            r=i+1;
            System.out.println("\n Ingrese la calificacion numero "+r);
            n[i] = scan.nextFloat();
        }
        
        r = Math.round((n[0] + n[1] + n[2])/3);//Math.round redondea el valor que se le pase como parametro
        
        System.out.println("El resultado es: "+r);//se puede poner print o printl, el segundo hace una bajada de linea al final
    }
    
}
