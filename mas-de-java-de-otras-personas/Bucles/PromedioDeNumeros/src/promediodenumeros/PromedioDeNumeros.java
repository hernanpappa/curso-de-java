/*
    Pedir numeros hasta que se introduzca un 0 y sacar el promedio.
*/

package promediodenumeros;

import javax.swing.JOptionPane;

public class PromedioDeNumeros {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "A continuación, introduzca numeros para sacar su promedio, el bucle para cuando introduzcas un 0");
        int suma = 0, numero, contador = 0;
        float promedio;
        boolean salir = false;
        
        while(!salir){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (numero == 0) salir = true;
            else{
                suma += numero;
                contador++;
            }
        }
        
        promedio = suma/contador;
        
        JOptionPane.showMessageDialog(null, "El promedio de los "+contador+" numeros es: "+promedio);
        
    }
    
}
