package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Crear un arreglo cual nos permita almacenar cien números enteros.
        
        int numeros[] = new int[100];
        
        //Llenar el arreglo con números aleatorios.
        //Para obtener un número aleatorio en Java podemos hacer uso de la siguiente sentencia.

        //int numero = (int)(Math.random() * 100);

        for ( int x = 0 ; x < 100 ; x++ ) {

            numeros[x] = (int)(Math.random() * 100);

        }
        
        //A partir del arreglo anteriormente creado:
  
        //Mostrar en consola el número mayor.

        int mayor = 0;

        for ( int numero : numeros  ) {

            if (numero > mayor){
                mayor = numero;
            }

        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println();
        
        //Mostrar en consola el número menor.
        
        int menor = 99999;

        for ( int numero : numeros ){

            if (numero < menor){
                menor = numero;
            }

        }

        System.out.println("Numero menor: " + menor);
        System.out.println();
        
        //Mostrar en consola todos los números primos.

        for ( int numero : numeros ){

            int contador = 2;
            boolean primo=true;

            while ((primo) && (contador!=numero)){

                if (numero % contador == 0) primo = false;
                contador++;

            }

            if (primo){

                System.out.println("Numero primo encontrado: " + numero);

            }

        }
        System.out.println();
        
        //Mostrar en consola todos los números pares.

        for ( int numero :  numeros){

            if(numero % 2 == 0){

                System.out.println("Numero par encontrado: " + numero);

            }

        }
        System.out.println();
        
        //Mostrar en consola el arreglo de forma ascendente.



        for (int i = 0 ; i < numeros.length - 1 ; i++) {
            int min = i;

            //buscamos el menor número
            for (int j = i + 1 ; j < numeros.length ; j++) {
                if (numeros[j] < numeros[min]) {
                    min = j;    //encontramos el menor número
                }
            }

            if (i != min) {
                //permutamos los valores
                int aux = numeros[i];
                numeros[i] = numeros[min];
                numeros[min] = aux;
            }
        }

        for ( int numero : numeros ){

            System.out.println("Ascendente: " + numero );

        }
        System.out.println();

        System.out.println(numeros.length);
        
        //Mostrar en consola el promedio del arreglo.
        
        int suma = 0;

        for( int numero : numeros){

            suma += numero;

        }

        int promedio = suma / numeros.length;
        System.out.println(promedio);
        System.out.println();
        
        //Mostrar en consola la suma del primer y último elemento del arreglo.
        
        int suma2 = numeros[0] + numeros[99];
        System.out.println("Suma del primer y ultimo numero: " + suma2);

        //Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.
    
        for(int numero : numeros){

            if(numero == 100){

                System.out.println("Existe cien");

            }

        }
    
    }
}
