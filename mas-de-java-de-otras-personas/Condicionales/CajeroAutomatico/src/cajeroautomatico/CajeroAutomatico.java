/*
  Simular un cajero automático con un saldo inicial de 1000 dolares, debe tener las opciones de retirar dinero, depositar dinero y salir
 */
package cajeroautomatico;

import javax.swing.JOptionPane;

public class CajeroAutomatico {

    public static void main(String[] args) {
        boolean salir = false;
        short op;
        int dinero, total=1000;
        
        while (!salir){
            op = Short.parseShort(JOptionPane.showInputDialog("1-Retirar dinero \n2-Depositar \n3-Salir"));
            switch(op){
                case 1: dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea retirar"));
                        if(dinero <= total && dinero > 0){
                            total -= dinero;
                            JOptionPane.showMessageDialog(null, "Transacción realizada con éxito.\nSu saldo restante es de $"+total);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Error en la transacción, su saldo es de $"+total);
                        }
                        ;break;
                case 2: dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea depositar"));
                        if(dinero > 0){
                            total += dinero;
                            JOptionPane.showMessageDialog(null, "Transacción realizada con éxito.\nSu saldo actual es de $"+total);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Error en la transacción, no puede depositar un saldo negativo");
                        }
                    
                    break;
                
                case 3: salir = true; break;
                
                default: JOptionPane.showMessageDialog(null, "El número ingresado no corresponde a una opción válida.");
            }
        }
        
    }
    
}
