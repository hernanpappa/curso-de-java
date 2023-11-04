/*
    Determinar si un numero es par o impar, el bucle se debe repetir hasta que el usuario ingrese un 0
 */
package paroimpar;

import javax.swing.JOptionPane;

public class ParOImpar {

    public static void main(String[] args) {
        int numero;
        boolean salir = false;
        
        while(!salir){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese unn número"));
            if (numero == 0) salir = true;
            else if(numero%2 == 0){
                JOptionPane.showMessageDialog(null, "El número es par");
            }
            else{
                JOptionPane.showMessageDialog(null, "El número es inpar");
            }
        }
    }
    
}
