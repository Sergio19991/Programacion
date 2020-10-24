package com.ejercicios12_10_2020;

import java.util.Scanner;

public class switcyopcondiconal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double radio;

        System.out.println("Introduce ewl radio");
        radio = sc.nextDouble();
        sc.nextLine();  //leer carectteres despues de numeros

        System.out.println("introduce la opcion");
        System.out.println("1 diametro");
        System.out.println("2 perimetro");
        System.out.println("3 area");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("DIAMETRO: ");
                break;
            case 2:
                System.out.println("PERIMETRO: ");
                break;
            case 3:
                System.out.println("AREA: ");
                break;
            default:
                System.out.println("noooooo");
        }
    }
}
