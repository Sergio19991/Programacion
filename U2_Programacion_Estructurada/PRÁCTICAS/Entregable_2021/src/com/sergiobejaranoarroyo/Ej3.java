package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int favorito1, favorito2, favorito3, num_loteria;
        String num1, num2, num3, lote;
        boolean todos = false;

        System.out.println("Introduzca sus números favoritos:");
        favorito1 = sc.nextInt();
        favorito2 = sc.nextInt();
        favorito3 = sc.nextInt();
        System.out.println("Introduzca el número de loteria: ");
        num_loteria = sc.nextInt();

        System.out.println(" ");

        num1 = Integer.toString(favorito1);
        num2 = Integer.toString(favorito2);
        num3 = Integer.toString(favorito3);
        lote = Integer.toString(num_loteria);

        if (lote.indexOf(num1) >= 0 && lote.indexOf(num2) >= 0 && lote.indexOf(num3) >= 0) {
            todos = true;
        } else {
            todos = false;
        }
        if (todos == true) {
            System.out.println("Ese número le va a dar suerte.");
        } else {
            System.out.println("Ese numero no le va a dar suerte.");
        }
    }
}