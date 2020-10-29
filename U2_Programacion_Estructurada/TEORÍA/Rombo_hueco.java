package com.ejercicios23_10_2020;

import java.util.Scanner;

public class Rombo_hueco {
    public static void main(String[] args) {
        int altura,num_esp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del rombo");
        altura = sc.nextInt();
        num_esp = (altura-1)/2;

        for (int i = 0; i < altura ; i++) {

            //Imprimir espacios
            for (int j = 0; j < num_esp ; j++) {
                System.out.print(" ");
            }

            //Imprimir X
            for (int j = 0; j < altura - 2*num_esp; j++) {
                //Cuando es el primero o el último de los caracteres X
                if (j==0 || j== altura-2*num_esp-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");

            if (i < altura/2) {
                //Primera mitad
                num_esp--;
            } else {
                //Segunda mitad
                num_esp++;
            }

        }
    }
}
