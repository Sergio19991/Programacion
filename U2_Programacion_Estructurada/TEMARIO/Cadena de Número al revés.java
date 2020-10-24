package com.ejercicios23_10_2020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;

        System.out.println("Introduce el Número:");
        num = sc.nextLine();

        for (int i=num.length()-1 ; i>=0 ; i--) {
            System.out.print(num.charAt(i));
        }
    }
}
