package com.bucles_con_for;

import java.util.Scanner;

public class ejercicio6_3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        boolean primo = true;

        System.out.println("Introduce un Número:");
        num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("SÍ es un Número Primo.");
        } else {
            System.out.println("NO es un Número Primo.");
        }
    }
}