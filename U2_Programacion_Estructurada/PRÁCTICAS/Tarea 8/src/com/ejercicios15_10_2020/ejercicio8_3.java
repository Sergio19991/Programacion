package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, secreto;

        secreto = (int) (Math.random()*101-1);
        System.out.println(secreto);

        System.out.println("Introduce el Número:");
        num = sc.nextInt();

        while (num!=-1) {
            if (num>secreto) {
                System.out.println("El Número buscado es Menor.");
            } else if (num<secreto) {
                System.out.println("El Número buscado es Mayor.");
            } else {
                System.out.println(" ¡HAS ACERTADO! ");
                break;
            }
            System.out.println("introduce el Número:");
            num = sc.nextInt();
        }
    }
}
