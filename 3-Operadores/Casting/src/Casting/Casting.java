package Casting;

public class Casting {
    public static void main(String[] args){
        //Casting

        int variableX = 50;
        float variableZ = 5.5f;
        int resultado;

        resultado = variableX + (int)variableZ; //(int) convierte variableZ a numero entero, sacando la parte decimal
        System.out.println(resultado);

        float res;
        res = (float)variableX + variableZ; //Tambien se puede convertir de int a float
        System.out.println(res);

        System.out.println((int)variableZ); //Tambien se puede convertir cuando se va a imprimir
    }
}
