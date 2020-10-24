package com.ejercicios12_10_2020;

import java.util.Scanner;

public class SwitchyOpCondcional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, espar;

        System.out.println("Introduce número");
        num = sc.nextInt();

        if (num%2==0) {
            espar=1;
        } else {
            espar=0;
        }

        espar = (num%2==0) ? 1 : 0 ;
    }
}
