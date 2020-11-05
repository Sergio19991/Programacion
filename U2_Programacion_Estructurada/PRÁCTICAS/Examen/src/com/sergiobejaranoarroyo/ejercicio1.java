package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entidad, sucursal, control, num_cuenta;

        entidad = "2222";
        sucursal = "3333";
        control = "44";

        System.out.println("Introduce el número de cuenta:");
        num_cuenta = sc.nextLine();
        /**
        if ((num_cuenta.charAt(0-3)!=entidad) && (num_cuenta.charAt(5-8)!=sucursal) && (num_cuenta.charAt(10-11)!=control)) {
            System.out.println("No es un de cuenta válido");
        } else {
            System.out.println("Es un número de cuenta válido.");
        }
         **/
    }
}
