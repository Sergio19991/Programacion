package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el Número:");
        num = sc.nextInt();

        while (num<0) {
            System.out.println("Debe ser un Número Positivo.");
            System.out.println("Introduce el Número:");
            num = sc.nextInt();
        }
    }
}