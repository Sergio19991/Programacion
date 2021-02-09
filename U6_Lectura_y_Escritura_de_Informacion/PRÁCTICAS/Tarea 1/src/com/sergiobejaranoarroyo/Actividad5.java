package com.sergiobejaranoarroyo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Actividad5 {
    public static void main(String[] args) throws Exception {
        BufferedReader entr1 = new BufferedReader(new FileReader("numeros.txt"));

        String cifra = entr1.readLine();

        int numero = Integer.valueOf(cifra);
        int maximo = numero;
        int minimo = numero;

        cifra = entr1.readLine();

        while (cifra != null) {
            numero = Integer.valueOf(cifra);

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            cifra = entr1.readLine();
        }

        entr1.close();

        System.out.println("MAYOR: " + maximo);
        System.out.println("MENOR: " + minimo);
    }
}