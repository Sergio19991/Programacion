package com.sergiobejaranaorroyo.Tarea3;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ALUM = 5;
        double mediaAlumno;

        int[] primer = new int[NUM_ALUM];
        int[] segundo = new int[NUM_ALUM];
        int[] tercer = new int[NUM_ALUM];

        System.out.println("Notas del Primer Trimestre:");
        leerNotas(primer);
        System.out.println("Notas del Segundo Trimestre:");
        leerNotas(segundo);
        System.out.println("Notas del Tercer Trimestre:");
        leerNotas(tercer);

        int sumaPrimer = 0;
        int sumaSegundo = 0;
        int sumaTercer = 0;

        for (int i = 0; i < NUM_ALUM; i++) {
            sumaPrimer += primer[i];
            sumaSegundo += segundo[i];
            sumaTercer += tercer[i];
        }

        System.out.println("Media del Primer Trimestre: " + (double) sumaPrimer / NUM_ALUM);
        System.out.println("Media del Segundo Trimestre: " + (double) sumaSegundo / NUM_ALUM);
        System.out.println("Media del Tercer Trimestre: " + (double) sumaTercer / NUM_ALUM);

        System.out.println(" ");

        System.out.println("Introduce la Posición del Alumno:");
        int pos = sc.nextInt();

        mediaAlumno = (double) (primer[pos] + segundo[pos] + tercer[pos]) / 3;
        System.out.println("La Media del Alumno, es " + mediaAlumno + ".");
    }

    public static void leerNotas(int[] t) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < t.length; i++) {
            System.out.print("Alumno (" + i + "): ");
            t[i] = sc.nextInt();
        }
    }

}