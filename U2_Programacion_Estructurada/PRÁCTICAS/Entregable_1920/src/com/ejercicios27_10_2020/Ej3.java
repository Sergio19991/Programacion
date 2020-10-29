package com.ejercicios27_10_2020;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, exp, digito;
        double binario;

        System.out.println("Introduce un Número Entero Positivo para pasarlo a Binario:");
        num = sc.nextInt();

        exp = 0;
        binario = 0;
        while (num != 0) {
            digito = num % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            num = num / 2;
        }
        System.out.printf("Binario: %.0f %n", binario);

    }
}
