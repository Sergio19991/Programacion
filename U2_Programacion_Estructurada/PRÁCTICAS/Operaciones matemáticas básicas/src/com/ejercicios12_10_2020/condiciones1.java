package com.ejercicios12_10_2020;

import java.util.Scanner;

public class condiciones1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un Número Entero");
        num = sc.nextInt();

        if (num>0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }
}
