package com.ejercicios12_10_2020;

import java.util.Scanner;

public class condiciones2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el Número 12");
        num = sc.nextInt();

        if (num==12) {
            System.out.println("Son IGUALES");
        } else {
            System.out.println("Son DISTINTOS");
        }
    }
}
