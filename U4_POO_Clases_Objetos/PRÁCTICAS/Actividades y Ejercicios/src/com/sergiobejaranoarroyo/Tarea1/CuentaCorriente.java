package com.sergiobejaranoarroyo.Tarea1;

public class CuentaCorriente {
    /**
     * ACTIVIDAD 1
     **/
    private double saldo;   //ACTIVIDAD 3
    public String nombre;   //ACTIVIDAD 3
    String dni;   // ACTIVIDAD 3
    private double limite;   // ACTIVIDAD 3
    static String nombreBanco = "BBVA";   // ACTIVIDAD 4
    Banco banco;   //ACTIVIDAD 6

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
        System.out.println("BANCO: " + nombreBanco);
    }

    /**
     * ACTIVIDAD 2
     **/
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


    /**
     * ACTIVIDAD 4
     **/
    static void cambiarNombreBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }

    /**
     * ACTIVIDAD 6
     **/

    CuentaCorriente(String nombre, String dni, Banco banco) {
        this(0, dni, -50);
        this.nombre = nombre;
        this.banco = banco;
    }

    void cambiarBanco(Banco banco) {
        this.banco = banco;
    }

    void mostrarInformacionBanco() {
        System.out.println("Información del Banco.");
        if (banco == null) {
            System.out.println("Cuenta no asociada a ningún Banco.");
        } else {
            banco.mostrarInformacion();
        }

        System.out.println("Información de la Cuenta.");
        System.out.println("TITULAR: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("SALDO: " + saldo);
        System.out.println("LÍMITE: " + limite);
    }
}