package com.ejercicios13_10_2020;

import java.util.Scanner;

public class ejercicio6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, espar;

        System.out.println("Introduce un Número Entero:");
        num = sc.nextInt();

           // Resuelto utilizando "if":
        if (num%2==0) {
            espar=1;
        } else {
             espar=0;
        }

           // Resuelto itilizando "Operado Condicional:"
        espar = (num%2==0) ? 1 : 0;   /*
                                        ? sireve para compara dos posibles soluciones. En este caso estamos comparando que el resto de dividir num entre 2,pueda dar 1 o 0.
                                      */
    }
}
