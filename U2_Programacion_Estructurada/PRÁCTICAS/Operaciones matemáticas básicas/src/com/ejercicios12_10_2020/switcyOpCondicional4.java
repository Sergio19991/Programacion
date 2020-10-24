package com.ejercicios12_10_2020;

import java.util.Scanner;

public class switcyOpCondicional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n1, n2, menor;

        System.out.println("num 1");
        n1 = sc.nextByte();
        System.out.println("num 2");
        n2 = sc.nextByte();

        if (n1>n2) {
            menor = n2;
        } else {
            menor = n1;
        }

        menor = (n1>n2) ? n2 : n1;
        System.out.println("el mayo " + menor);
    }
}
