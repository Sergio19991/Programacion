package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio6_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int login, password;

        do {
            System.out.println("Introduce tu Usuario:");
            login = sc.nextInt();
            System.out.println("Introduce tu Contraseña:");
            password = sc.nextInt();
        } while ((login!=1809) && (password!=1234));

        System.out.println(" HAS ENTRADO EN EL SISTEMA ");
    }
}
