package com.sergiobejaranoarroyo.Empresa;

import java.util.Calendar;

public class Empleado {
    String nombreCompleto;
    String numeroSeguridadSocial;
    String telefono;
    Calendar fechaContratacion;
    String tipoEmpleado;

    public enum tipo {ADMINISTRATIVO, TECNICO, DIRECTIVO}

    public Empleado(String nombreCompleto, String numeroSeguridadSocial, String telefono, Calendar fechaContratacion, String tipoEmpleado) {
        this.nombreCompleto = nombreCompleto;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;
        this.tipoEmpleado = "técnico";
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Calendar getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Calendar fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", tipoEmpleado='" + tipoEmpleado + '\'' +
                '}';
    }

    /**
     * PERMITE MOSTAR LOS DATOS DEL EMPLEADO:
     **/
    public void mostrarDatosEmpleado() {
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Número de la Seguridad Social: " + numeroSeguridadSocial);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fecha de Contratación " + fechaContratacion);
        System.out.println("Tipo de Empleado: " + tipoEmpleado);

    }
}