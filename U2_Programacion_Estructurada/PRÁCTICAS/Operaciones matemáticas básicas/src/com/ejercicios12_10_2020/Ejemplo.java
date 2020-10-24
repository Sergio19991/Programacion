package com.ejercicios12_10_2020;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Introduzca los dos Números:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1>n2) {
            System.out.println("Es mayor " + n1);
        } else if (n2>n1) {
            System.out.println("Es mayor " + n2);
        } else {
            System.out.println("Son iguales");
        }
    }
}
