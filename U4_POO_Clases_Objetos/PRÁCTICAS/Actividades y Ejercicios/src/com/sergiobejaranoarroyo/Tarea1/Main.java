package com.sergiobejaranoarroyo.Tarea1;

public class Main {
    public static void main(String[] args) {
        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 1 *");
        System.out.println("* * * * * * * *");
        CuentaCorriente c;
        c = new CuentaCorriente("Pepe", "12345678A");

        c.limite = -100;

        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();

        System.out.println("Puedo sacar 700€: " + c.egreso(700));
        System.out.println("Puedo sacar 500€: " + c.egreso(500));

        System.out.println(" ");


        System.out.println("* * * * * * * *");
        System.out.println("* ACTIVIDAD 2 *");
        System.out.println("* * * * * * * *");
        CuentaCorriente c1, c2, c3;

        c1 = new CuentaCorriente("Pepe", "12345678A");
        c2 = new CuentaCorriente(1000);
        c3 = new CuentaCorriente(1000, "12345678A", 50);

        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();

        System.out.println(" ");
    }
}