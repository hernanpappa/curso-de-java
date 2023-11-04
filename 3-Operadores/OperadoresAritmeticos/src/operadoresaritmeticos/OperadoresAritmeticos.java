/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Hernan David
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //Operadores aritmeticos
        
        int variableX = 50, variableY = 10;
        int resultado;
        
        resultado = variableX + variableY; //Suma
        System.out.println(resultado);
        
        resultado = variableX - variableY; //Resta
        System.out.println(resultado);
        
        resultado = variableX * variableY; //Multiplicacion
        System.out.println(resultado);
        
        resultado = variableX / variableY; //Division
        System.out.println(resultado);
        
        variableX = variableX + 1;
        System.out.println(variableX);
        
        variableX++; //Con el ++ incrementa en 1
        System.out.println(variableX);
        
        variableX--; //Con el -- decrece en 1
        System.out.println(variableX);
        variableX--;
        
        variableX += 100; //+= le suma el valor que queremos a la variable
        System.out.println(variableX);
        
        variableX -= 100; //-= le resta el valor que queremos a la variable
        System.out.println(variableX);
        
        variableX *= 3; //Con *= multiplicamos variableX con el valor que queremos
        System.out.println(variableX);
        
        variableX /= 5; //Con /= dividimos variableX con el valor que queremos
        System.out.println(variableX);
        
        
    }
    
}
