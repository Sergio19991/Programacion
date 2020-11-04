package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Sumar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Introduce 3 numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        System.out.print("La suma es ");
        System.out.println(sumaNumeros(num1, num2, num3));


    }

    public static int sumaNumeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}