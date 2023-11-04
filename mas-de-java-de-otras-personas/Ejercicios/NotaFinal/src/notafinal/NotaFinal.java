/*
 Calcular la nota final de un estudiante cuando su presentismo vale  un 10%, sus dos examenes 25% y la evaluacion fianl 40%
 */
package notafinal;

import java.util.Scanner;

public class NotaFinal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float presentismo, nota1, nota2, evFinal, resultado;
        
        System.out.print("Ingrese el presentismo: ");
        presentismo = scan.nextFloat();
        System.out.print("Ingrese la nota del primer examen: ");
        nota1 = scan.nextFloat();
        System.out.print("Ingrese la nota del segundo examen: ");
        nota2 = scan.nextFloat();
        System.out.print("Ingrese la nota de la evaluacion final: ");
        evFinal = scan.nextFloat();
        
        presentismo *= 0.10f;//cuando usamos numeros float hay que poner una f al final
        nota1 *= 0.25f;
        nota2 *= 0.25f;
        evFinal *= 0.40f;
        
        resultado = presentismo + nota1 + nota2 + evFinal;
        System.out.println("Nota final: "+resultado);
    }
    
}
