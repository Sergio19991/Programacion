package com.sergiobejaranoarroyo;

public class Banco {
    /**
     * ACTIVIDAD 6
     **/
    final private String nombre;
    public double capital = 5.2;
    public String direccion = "Sin dirección.";

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public Banco(String nombre, double capital, String direccion) {
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public void mostrarInformacion() {
        System.out.println("BANCO: " + nombre);
        System.out.println("CAPITAL: " + capital + " millores de euros.");
        System.out.println("DIRECCIÓN: " + direccion);
        System.out.println(" ");
    }
}