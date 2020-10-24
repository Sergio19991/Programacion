package com.ejercicios15_10_2020;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ejercicio8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el Número:");
        num = sc.nextInt();

        while (num!=0) {
            if (num%2==0) {
                System.out.println("El Número " + num + " es Par.");
            }

            if (num>0) {
                System.out.println("El Número " + num + " es Positivo.");
            }

            System.out.println("El cuadrado de " + num + " es " + Math.pow(num,2) + ".");

            System.out.println("Introduce el Número:");
            num = sc.nextInt();
        }
    }
}
