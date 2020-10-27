package com.ejercicios16_10_2020;

import java.util.Scanner;

public class ejercicio8b_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano, i, j, p;
        String caracter;

        System.out.println("Introduce el Tamaño de la Pirámide:");
        tamano = sc.nextInt();
        System.out.println("Introduce el Carácter con el que se pintará la Pirámide:");
        caracter = sc.next();

        System.out.println(" ");   //Simplemente es un espacio en blanco.
                                   //Estética de cara al Usuario.

        for (i=1 ; i<=tamano ; i++) {
            for (j=1 ; j<=tamano-i ; j++) {
                System.out.print(" ");
            }
            for (p=1 ; p<=(i*2)-1 ; p++) {
                System.out.print(caracter);
            }
            System.out.println();   //Salto de línea.
        }

        /**Otra posible solución (NO SE LE PIDE EL CARACTER AL USUARIO)**/

        /*
        int altura, num_espacios;
        Scanner sc = new Scanner(System.in);

        //Solicito la altura de la pirámide
        System.out.println("Introduce la altura");
        altura = sc.nextInt();

        //Calculo el número de espacios de la primera fila
        num_espacios = altura-1;

        for (int i = 1; i <=altura; i++) {

            //Escribimos los espacios en blanco
            for (int j=0; j<num_espacios;j++) {
                System.out.print("-");
            }

            //Escribimos los asteriscos
            // La anchura de la pirámide siempre será 2*altura -1
            // El número de asteriscos será la diferencia de restar a esa anchura
            // el doble de los espacios en blanco que estoy pintando (a ambos lados de los *)
            for (int j = 0; j < ((2*altura)-1)- 2*num_espacios; j++) {
                System.out.print("*");
            }

            System.out.println("");
            num_espacios--;
        }

         */

    }
}
