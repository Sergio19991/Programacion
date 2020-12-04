package com.sergiobejaranaorroyo.Entregable_2021;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int[] n = new int[0];

        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 9);
            if (n[i] == 0) {
                System.out.println("_ _ _ _ _");
            } else if (n[i] == 1) {
                System.out.println("· _ _ _ _");
            } else if (n[i] == 2) {
                System.out.println("· · _ _ _");
            } else if (n[i] == 3) {
                System.out.println("· · · _ _");
            } else if (n[i] == 4) {
                System.out.println("· · · · _");
            } else if (n[i] == 5) {
                System.out.println("· · · · ·");
            } else if (n[i] == 6) {
                System.out.println("_ · · · ·");
            } else if (n[i] == 7) {
                System.out.println("_ _ · · ·");
            } else if (n[i] == 8) {
                System.out.println("_ _ _ · ·");
            } else if (n[i] == 9) {
                System.out.println("_ _ _ _ ·");
            }
        }

        System.out.println(Arrays.toString(n));
    }
}