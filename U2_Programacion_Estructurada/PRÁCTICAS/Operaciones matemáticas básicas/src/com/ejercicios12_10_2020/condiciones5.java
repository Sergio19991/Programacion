package com.ejercicios12_10_2020;

import java.util.Scanner;

public class condiciones5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1, num2, num3;

        System.out.println("Introduce el Primer Número;");
        num1 = sc.nextLong();
        System.out.println("Introduce el Segundo Número;");
        num2 = sc.nextLong();
        System.out.println("Introduce el Tercer Número;");
        num3 = sc.nextLong();

        if ((num1>num2) && (num1>num3)) {
            System.out.println(num1 + " Es el Mayor.");
        } else if (num2>num3) {
            System.out.println(num2 + " Es el Mayor.");
        } else  {
            System.out.println(num3 + " Es el mayor.");
        }
    }
}
