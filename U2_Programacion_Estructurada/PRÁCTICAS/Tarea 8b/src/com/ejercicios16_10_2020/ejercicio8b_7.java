package com.ejercicios16_10_2020;

import java.util.Scanner;

public class ejercicio8b_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, retorno, digito;

        retorno = 0;

        System.out.println("Introduce el Número;");
        num = sc.nextInt();

        while (num>0) {
            digito = num%10;
            num = num-digito;
            num = num/10;
            retorno = retorno*10+digito;
        }

        System.out.println(retorno);
    }
}
