package com.sergiobejaranoarroyo;

import java.util.Objects;

public class Profesor extends Persona {
    private String nss;
    private String asignatura;

    public Profesor(String name, String dni, String tlf, String email, String direccion, String nss, String asignatura) {
        super(name, dni, tlf, email, direccion);
        this.nss = nss;
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nss='" + nss + '\'' +
                ", asignatura='" + asignatura + '\'' +
                '}';
    }

    @Override
    public void gritar() {
        System.out.println("El Profesor no GRITA");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(nss, profesor.nss) && Objects.equals(asignatura, profesor.asignatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nss, asignatura);
    }
}