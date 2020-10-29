package com.ejercicios12_10_2020;

public class repetitivaas {
    public static void main(String[] args) {
        int x;

        x=0;

        while (x<=100) {
            System.out.println("WHILE " + x);
            x++;
        }

        do {
            System.out.println("DO-WHILE " + x);
        } while (x<=100);

        for (int i = 0; i <= 10; i++) {
            System.out.println("FOR " + i);
        }
    }
}
