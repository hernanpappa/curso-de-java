package multiplode10;

import java.util.Scanner;

public class MultiploDe10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese un numero: ");
        n = scan.nextInt();
        
        if(n % 10 == 0){
            System.out.println("\n El número es multiplo de 10");
        }
        else{
            System.out.println("\n El número no es multiplo de 10");
        }
    }
    
}
