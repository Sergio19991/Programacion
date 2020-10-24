package com.ejercicios12_10_2020;

import java.util.Scanner;

public class condciciones6 {
    public static void main(String[] args) {
        final double g = 9.8;
        double t;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tiempo");
        t = sc.nextDouble();

        if (t<0) {
            System.out.println("Tiempo incorrecto");
        } else {
            System.out.println("V=" + (t*g));
        }
    }
}
