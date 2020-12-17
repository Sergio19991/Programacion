package com.sergiobejaranoarroyo.Tarea1;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente c;
        c = new CuentaCorriente("Pepe", "12345678A");

        c.limite = -100;

        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();

        System.out.println("Puedo sacar 700€: " + c.egreso(700));
        System.out.println("Puedo sacar 500€: " + c.egreso(500));
    }
}