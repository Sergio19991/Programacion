package com.ejercicios12_10_2020;

import java.util.Scanner;

public class EjOperadorCond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce num");
        num = sc.nextInt();

        System.out.println(num%2==0 ? "Es par" : " Es impar");
    }
}
