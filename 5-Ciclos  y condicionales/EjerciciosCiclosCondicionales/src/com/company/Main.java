package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int x = 0; x <= 6; x++){

            for(int i = 0; i <= x; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int x = 0; x <= 6; x++){

            for(int i = 12; i >= x; i--){
                System.out.print(" ");
            }
            for(int i = 0; i <= (x * 2) ; i++){
                System.out.print("*");
            }
            System.out.print(x);
            System.out.println();
        }

        for(int i = 1; i < 4570 ; i *= 2){
            System.out.printf("I x 2 = %d \n", i);
        }
    }
}
