package com.sergiobejaranoarroyo.Tarea1;

public class CuentaCorriente {
    private double saldo;
    public String nombre;
    String dni;
    private double limite;

    public CuentaCorriente(String nombre, String dni) {
        saldo = 0;
        this.nombre = nombre;
        this.dni = dni;
        limite = -50;
    }

    boolean egreso(double cant) {
        boolean operacionPosible;

        if ((saldo - cant) >= limite) {
            saldo -= cant;
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente.");
            operacionPosible = false;
        }

        return (operacionPosible);
    }

    void ingreso(double cant) {
        saldo += cant;
    }

    void mostrarInformacion() {
        System.out.println("NOMBRE: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("SALDO: " + saldo);
        System.out.println("LÍMITE DESCUBIERTO: " + limite);
    }

    public CuentaCorriente(double saldo) {
        this.saldo = 0;
        this.nombre = "Sin asignar";
        this.dni = "Sin asignar";
        this.limite = 0;
    }

    public CuentaCorriente(double saldo, String dni, double limite) {
        this.saldo = saldo;
        this.dni = dni;
        this.limite = limite;
        this.nombre = "Sin asignar";
    }
}