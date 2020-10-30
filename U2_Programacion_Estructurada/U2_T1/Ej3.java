package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favorito1, favorito2, favorito3, num_loteria;

        System.out.println("Introduzca sus números favoritos:");
        favorito1 = sc.nextLine();
        favorito2 = sc.nextLine();
        favorito3 = sc.nextLine();
        System.out.println("Introduzca el número de la lotería:");
        num_loteria = sc.nextLine();
    }
}