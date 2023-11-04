/*
 * Introducir un número y mostrar su cuadrado, repetir hasta que se ingrese un numero negativo
 */
package cuadradonumero;

import javax.swing.JOptionPane;

public class CuadradoNumero {

    public static void main(String[] args) {
        int numero;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para obtener su cuadrado"));
            if(numero > 0) JOptionPane.showMessageDialog(null, "El cuadrado de "+numero+" es "+(numero * numero));
        }
        while(numero > 0);
    }
    
}
