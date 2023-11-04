/*
Determinar si una letra es mayuscula o minuscula
OPCIONAL: usar JOptionPane
 */
package mayuscula;

import javax.swing.JOptionPane; //libreria para usar joptionpane
//JOptionPane es una clase para la interaccion con el usuario, entrada y salida de datos con una sencilla interfaz grafica

public class Mayuscula {

    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("Ingrese una letra para determinar si es mayuscula o minuscula").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra ingresada es mayuscula.");
        }
        else{
            JOptionPane.showMessageDialog(null, "La letra ingresada es minuscula.");
        }
    }
    
}
