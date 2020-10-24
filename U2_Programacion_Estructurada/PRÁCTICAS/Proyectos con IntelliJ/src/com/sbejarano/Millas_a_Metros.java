package com.sbejarano;

import java.util.Scanner;

public class Millas_a_Metros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float longitud;

        System.out.println("Introduce el número de Millas:");
        longitud = sc.nextFloat();

        System.out.println(longitud + " millas son " + (longitud*1.609));

    }
}
