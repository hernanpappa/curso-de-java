package ordenar3numeros;

import javax.swing.JOptionPane;

public class Ordenar3Numeros {
    
    public static void main(String[] args) {
        int[] n = new int[3];
        n[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        n[1] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        n[2] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        
        if(n[0] == n[1] || n[0] == n[2] || n[2] == n[1]){
            JOptionPane.showMessageDialog(null, "No puede ingresar dos numeros iguales, alta paja poner mas ifs");
        }
        else if(n[0] > n[1] && n[0] > n[2]){
            System.out.println(n[0]+" es el numero mas grande");
            if(n[1] > n[2]){
                System.out.println(n[1]+" es el del medio \n"+n[2]+" es el mas pequeño");
            }
            else{
                System.out.println(n[2]+" es el del medio \n"+n[1]+" es el mas pequeño");
            }
        }
        else if(n[1] > n[0] && n[1] > n[2]){
            System.out.println(n[1]+" es el numero mas grande");
            if(n[0] > n[2]){
                System.out.println(n[0]+" es el del medio \n"+n[2]+" es el mas pequeño");
            }
            else{
                System.out.println(n[2]+" es el del medio \n"+n[0]+" es el mas pequeño");
            }
        }
        else if(n[2] > n[0] && n[2] > n[1]){
            System.out.println(n[2]+" es el numero mas grande");
            if(n[1] > n[0]){
                System.out.println(n[1]+" es el del medio \n"+n[0]+" es el mas pequeño");
            }
            else{
                System.out.println(n[0]+" es el del medio \n"+n[1]+" es el mas pequeño");
            }
        }
    }
    
}
