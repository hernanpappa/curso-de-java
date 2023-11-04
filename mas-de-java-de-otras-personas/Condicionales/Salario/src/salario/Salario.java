/*
Calcular el salario semanal de un empleado al que le pagan 16 las primeras 40 horas y 20 las demas.
 */
package salario;

import javax.swing.JOptionPane;

public class Salario {

    public static void main(String[] args) {
        int horas, salario;
        //JOptionPane devuelve un string, asi que para asignarlo a la variable horas, primero debemos convertirlo a entero con el metodo parseInt.
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas"));
        
        if(horas > 40){
            salario = (40*16) + ((horas-40) * 20);
        }
        else{
            salario = horas * 16;
        }
        JOptionPane.showMessageDialog(null, "El total es de "+salario+" dolares");
        
    }
    
}
