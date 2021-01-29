package com.sergiobejaranoarroyo;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

    private String nombre;
    private String dni;
    private Integer edad;
    private double saldo;

    public Cliente(String nombre, String dni, int edad, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\n' +
                ", dni='" + dni + '\n' +
                ", edad=" + edad + '\n' +
                ", saldo=" + saldo + '\n' +
                '}';
    }

    @Override
    public int compareTo(Cliente o) {
        return edad-o.edad;
    }
}