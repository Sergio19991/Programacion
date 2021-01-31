package com.sergiobejaranoarroyo;

public class Cliente implements Comparable {
    /*****************/
    /** ACTIVIDAD 2 **/
    /*****************/

    String dni;
    String nombre;
    int edad;
    double saldo;

    public Cliente(String dni, String nombre, int edad, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object otro) {
        return dni.equals(((Cliente) otro).dni);
    }

    /*@Override*/
    public String toSrtring() {
        return "\nDni: " + dni + "  Nombre: " + nombre + "  Edad: " + edad + "  Saldo: " + saldo;
    }

    @Override
    public int compareTo(Object otro) {
        return dni.compareTo(((Cliente) otro).dni);
    }
}