package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio6_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login, password;

        System.out.println("Introduce tu Usuario");
        login = sc.nextLine();
        System.out.println("introduce tu Contraseña:");
        password = sc.nextLine();

        while (!password.equals("1234") || !login.equals("1809")) {
            System.out.println("Introduce tu Usuario");
            login = sc.nextLine();
            System.out.println("introduce tu Contraseña:");
            password = sc.nextLine();
        }
    }
}
