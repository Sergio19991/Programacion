package com.sergiobejaranoarroyo;

public class candenaAlReves {
    public static void main(String[] args) {
        String cadena = "0123456789";
        String invertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        System.out.println(cadena);
        System.out.println(invertida);
    }
}