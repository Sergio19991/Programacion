package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio6_3_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num;
        boolean primo = true;

        System.out.println("Introduce el número:");
        num = sc.nextLong();

        for (int i=2 ; i<num ; i++) {
            if (num%i==0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("SÍ es un Número Primo:");
        } else {
            System.out.println("NO es un Número Primo.");
        }
    }
}
