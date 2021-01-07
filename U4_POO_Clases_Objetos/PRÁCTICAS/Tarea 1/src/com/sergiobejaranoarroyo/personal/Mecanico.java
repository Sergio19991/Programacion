package com.sergiobejaranoarroyo.personal;

public class Mecanico {
    private String nombreCompleto;
    private String telefono;
    private Especialidades especialidad;

    public Mecanico(String nombreCompleto, String telefono, Especialidades especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public Mecanico(String pepe_perez, String telefono) {

    }

    /*public Mecanico(String nombreCompleto, String telefono) {
        this(nombreCompleto, telefono, Especialidades.GENERAL);
    }*/

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidades especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}