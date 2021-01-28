package com.sergiobejaranoarroyo;

import java.util.Objects;

public class Cliente implements Comparable {
    protected int dni;
    protected String nombre;
    protected int edad;
    protected int saldo;

    public Cliente(int dni, String nombre, int edad, int saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return dni == cliente.dni && edad == cliente.edad && saldo == cliente.saldo && nombre.equals(cliente.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, edad, saldo);
    }

    @Override
    public int compareTo(Object o) {
        int resultado;

        if (dni < ((Cliente) o).dni) {
            resultado = -1;
        } else if (dni > ((Cliente) o).dni) {
            resultado = 1;
        } else {
            resultado = 0;
        }

        return resultado;
    }
}