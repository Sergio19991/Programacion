package com.sergiobejaranoarroyo.Tarea1;

public class CuentaCorriente {
    private double saldo;
    private double limiteDescubrimiento;
    public String nombre;
    String dni;
    static String nombreBanco;

    /**
     * ACTIVIDAD 1:
     **/
    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limiteDescubrimiento = -50;
    }

    public boolean sacarDinero(double cantidad) {
        if ((this.saldo - cantidad) > this.limiteDescubrimiento) {
            this.saldo -= cantidad;
            return true;
        } else {
            System.out.println("Operación no permitida.");
            return false;
        }
    }

    public void ingresarDinero(double cantidad) {
        this.saldo += cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Entidad " + CuentaCorriente.nombreBanco);
        System.out.println("Titular: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo: " + this.saldo);
    }


    /**
     * ACTIVIDAD 2:
     **/
    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.nombre = " ";
        this.dni = " ";
        this.limiteDescubrimiento = 0;
    }

    public CuentaCorriente(double saldo, double limiteDescubrimiento, String dni) {
        this.saldo = saldo;
        this.limiteDescubrimiento = limiteDescubrimiento;
        this.dni = dni;
    }


    /**  ACTIVIDAD 4: **/
    public static void compraBanco(String bancoNuevo) {
        nombreBanco=bancoNuevo;
    }
}