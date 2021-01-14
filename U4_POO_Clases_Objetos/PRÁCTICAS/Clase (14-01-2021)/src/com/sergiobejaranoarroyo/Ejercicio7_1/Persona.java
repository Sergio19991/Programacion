package com.sergiobejaranoarroyo.Ejercicio7_1;

public class Persona {
    String nombreCompleto;
    String dni;

    public Persona(String nmobreCompleto, String dni) {
        this.nombreCompleto = nmobreCompleto;
        this.dni = dni;
    }

    public String getNmobreCompleto() {
        return nombreCompleto;
    }

    public void setNmobreCompleto(String nmobreCompleto) {
        this.nombreCompleto = nmobreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nmobreCompleto='" + nombreCompleto + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public String getDatos() {
        return nombreCompleto;
        return dni;
    }
}