package com.ejercicios03_11_2020;

public class DecirPrimos {
    public static void main(String[] args) {
        if (esPrimo(5)) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        for (int i=2 ; i<numero ; i++) {
            if (numero%i == 0) {
                return false;
            }
        }
        return true;
    }
}

