package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] temperatura = new int[5][2];

        boolean existeTemperatura;

        int indice, cantidadDias = 5, temperaturaMax, temperaturaMinima;

        for (indice = 0; indice < cantidadDias - 1; indice++) {
            System.out.print("Día " + (indice + 1) + ". Temperatura Mínima:");
            temperatura[indice][0] = sc.nextInt();

            System.out.print("Día " + (indice + 1) + ". Temperatura Máxima:");
            temperatura[indice][1] = sc.nextInt();
        }

        System.out.println("Temperaturas Medias:");
        System.out.println("--------------------");

        for (int i = 0; i < cantidadDias - 1; i++) {
            System.out.println("Día " + (i + 1) + ". Temperatura Media: " + (temperatura[indice][0] + temperatura[i][1]) / 2);
        }

        temperaturaMinima = temperatura[0][0];

        for (int i = 0; i < cantidadDias - 1; i++) {
            if (temperatura[i][0] < temperaturaMinima) {
                temperaturaMinima = temperatura[i][0];
            }
        }

        System.out.println("Días con Menos Temperatura:");
        System.out.println("---------------------------");

        for (int i = 0; i < cantidadDias - 1; i++) {
            if (temperatura[i][0] == temperaturaMinima) {
                System.out.println("Día " + (i + 1));
            }
        }

        existeTemperatura = false;

        System.out.println("Días con Temperatura Máxima:");
        System.out.println("----------------------------");

        System.out.print("Introduce una Temperatura:");
        temperaturaMax = sc.nextInt();

        for (int i = 0; i < cantidadDias - 1; i++) {
            if (temperatura[i][1] == temperaturaMax) {
                existeTemperatura = true;
            }
        }

        if (existeTemperatura = false) {
            System.out.println("No hay ningún Día con dicha Temperatura.");
        }
    }
}