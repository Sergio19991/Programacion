package com.sergiobejaranoarroyo;

public class capicua {
    public static void main(String[] args) {
        String cadena = "2992";
        String invertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        if (cadena.equals(invertida)) {
            System.out.println("ES CAPICUA");
        } else {
            System.out.println("NO ES CAPICUA");
        }
    }
}