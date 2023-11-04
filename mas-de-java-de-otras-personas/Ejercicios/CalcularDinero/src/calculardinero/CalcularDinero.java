/*Guillermo tiene una cantidad de dinero, luis tiene la mitad y juan tiene la mitad del total entre guillermo y luis*/
package calculardinero;

import java.util.Scanner;//es  necesario para usar scanner

public class CalcularDinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//scan es una instancia de la clase scanner que se usa para leer datos de entrada
        //scan se puede llamar de cualquier otra forma
        int guillermo;
        float luis, juan;
        
        System.out.print("Ingrese la cantidad de dinero que tiene Guillermo: ");
        guillermo = scan.nextInt();//esto seria el equivalente a un scanf de c, se escribe scan.next(y el tipo de variable que esperamos)
        
        luis = guillermo/2;
        
        juan = (guillermo + luis)/2;
        
        System.out.println("\n\n Guillermo tiene "+guillermo+" dolares.");
        System.out.println("\n\n Luis tiene "+luis+" dolares.");
        System.out.println("\n\n Juan tiene "+juan+" dolares. \n");
        
    }
    
}
