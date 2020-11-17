package com.sergiobejaranaorroyo.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        int t[] = {2, 5, 5, -3, 0};
        int ignorados = rellenaPares(t);

        System.out.println("El número de Impares ignorados, es de " + ignorados + ".");
        System.out.println(Arrays.toString(t));
    }

    public static int rellenaPares(int pares[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int imparesIgnorados = 0;

        while (i < pares.length) {
            System.out.println("Introduce número:");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares[i] = num;
                i++;
            } else {
                imparesIgnorados++;
            }
        }

        return (imparesIgnorados);
    }

}