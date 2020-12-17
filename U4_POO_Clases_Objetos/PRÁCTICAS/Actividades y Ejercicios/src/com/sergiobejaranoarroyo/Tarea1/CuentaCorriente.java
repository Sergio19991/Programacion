package com.sergiobejaranoarroyo.Tarea1;

public class CuentaCorriente {
    double saldo;
    String nombre;
    String dni;
    double limite;

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
}