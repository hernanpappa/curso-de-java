/*
    Pedir 10 numeros y mostrar el promedio de positivos, el promedio de negativos y la cantidad de ceros
 */
package pkg10numeros;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int negativos = 0, positivos = 0, ceros = 0, cantN = 0, cantP = 0, n;
        float promN, promP;
        
        JOptionPane.showMessageDialog(null, "A continuación ingrese 10 números.");
        
        for (int i = 0; i < 10; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            
            if (n == 0) ceros++;
            else if(n > 0){
                positivos += n;
                cantP++;
            }
            else{
                negativos += n;
                cantN++;
            }
        }
        
        if (cantN==0){
            promN=0;
        }
        else{
            promN = negativos / cantN;
        }
        
        if (cantP == 0){
            promP = 0;
        }
        else{
            promP = positivos / cantP;
        }
        
        JOptionPane.showMessageDialog(null, "El promedio de positivos es "+promP+", el promedio de negativos es "+promN+" y hay "+ceros+" ceros");
    }
    
}
