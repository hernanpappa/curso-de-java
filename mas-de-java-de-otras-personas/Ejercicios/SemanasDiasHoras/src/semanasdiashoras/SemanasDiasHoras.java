package semanasdiashoras;

import java.util.Scanner;

public class SemanasDiasHoras {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horas, semanas, dias;
        System.out.print("Ingrese una cantidad de horas: ");
        horas = scan.nextInt();//se lee la entrada de teclado
        
        semanas = Math.round(horas/168);//obtenemos las semanas
        horas -= semanas*168;//restamos las semanas
        dias =Math.round(horas/24);//obtenemos los dias
        horas -= dias*24;//restamos los dias
        
        System.out.println(semanas+" semanas, "+dias+" días y "+horas+" horas.");
    }
    
}
