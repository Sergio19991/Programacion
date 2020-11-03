package com.sergiobejaranoarroyo;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numero_final, cifra, digitos_eliminados;

        System.out.println("Introduzca un número entero positivo:");
        num = sc.nextInt();

        digitos_eliminados = 0;
        numero_final = 0;

        while (num!=0) {
            int log = (int) Math.log10(num);
            cifra = num / (int) Math.pow(10,log);

            if (cifra!=0 && cifra!=8) {
                numero_final = numero_final*10+cifra;
            }
            num = num-cifra*(int) Math.pow(10,log);
        }

        System.out.println("Número resultado: " + numero_final);
        System.out.println("Dígitos eliminados: " + digitos_eliminados);
    }
}
