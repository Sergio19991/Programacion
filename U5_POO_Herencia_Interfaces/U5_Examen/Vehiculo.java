package com.sergiobejaranoarroyo;

public abstract class Vehiculo extends Conductor {
    public String matricula;
    public double cargaMaxima;
    Conductor conductor;

    public Vehiculo(String nombre, String apellidos, int nss, String matricula, double cargaMaxima, Conductor conductor) {
        super(nombre, apellidos, nss);
        this.matricula = matricula;
        this.cargaMaxima = cargaMaxima;
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nss=" + nss +
                ", matricula='" + matricula + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", conductor=" + conductor +
                '}';
    }
}