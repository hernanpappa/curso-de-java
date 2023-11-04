package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Cuando queremos hacer un arreglo de figuras conde tenemos varias deberiamos de hacer una por cada
        //tipo de figura ya que cada una pertenece a una clase distinta, pero comparten un mismo padre.
        //Principio de sustitucion nos viene a solucionar este problema.

        //Principio de Sustitucion: nos permite trabajar una subclase(clase hija) como una clase padre
        //Triangulo es una figura
        //Circulo es una figura
        //Asique podemos tratarlas como una figura con el principio de sustitucion, para si poder ponerlas
        //en un mismo arreglo

        //Para tratarlas como figura debemos de poner la parte izquierda como clase figura
        // y la derecha como la figura a elegir ( circulo o triangulo en este caso)

        Figura circulo = new Circulo(9f);
        Figura triangulo = new Triangulo(10f, 5f);

        //Ahora al ser circulo y triangulo tratadas como Figura, podemos meterlas en arreglos de la clase Figura

        Figura figuras[] = new Figura[2];

        figuras[0] = circulo;
        figuras[1] = triangulo;

        System.out.println(figuras[0].area());
        System.out.println(figuras[1].area());

    }
}
