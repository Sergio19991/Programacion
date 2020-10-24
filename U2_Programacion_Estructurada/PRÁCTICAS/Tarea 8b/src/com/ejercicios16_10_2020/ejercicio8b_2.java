package com.ejercicios16_10_2020;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ejercicio8b_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i;

        System.out.println("introduce el Número:");
        num = sc.nextInt();

        System.out.println("-----------------------------------------");

        for(i=num+1 ; i<=num+5 ; i++) {
            System.out.println("Número: " + i + " | Cuadrado: " + (i*i) + " | Cubo: " + Math.pow(i,3));
        }
        System.out.println("-----------------------------------------");
    }
}
