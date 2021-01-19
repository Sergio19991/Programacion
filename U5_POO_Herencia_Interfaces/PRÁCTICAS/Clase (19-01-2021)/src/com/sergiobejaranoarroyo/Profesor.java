package com.sergiobejaranoarroyo;

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
}