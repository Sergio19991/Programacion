package com.sergiobejaranoarroyo.ejercicio1;

public class Moto extends Vehiculo implements Comparable {
    protected String matricula;
    protected int anoMatriculacion;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    enum Color {AZUL, AMARILLO, ROJO, VERDE}

    public Moto(String nombre, int numeroPersonas, Tipo tipoVehiculo, String matricula, int anoMatriculacion) {
        super(nombre, numeroPersonas, tipoVehiculo);
        this.matricula = matricula;
        this.anoMatriculacion = anoMatriculacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoMatriculacion() {
        return anoMatriculacion;
    }

    public void setAnoMatriculacion(int anoMatriculacion) {
        this.anoMatriculacion = anoMatriculacion;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "matricula='" + matricula + '\'' +
                ", anoMatriculacion=" + anoMatriculacion +
                ", nombre='" + nombre + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                ", tipoVehiculo=" + tipoVehiculo +
                '}';
    }

    /*@Override*/
    public int compareTo_Matricula(Object o) {
        return 0;
    }

    /*@Override*/
    public int compareTo_AnoMatriculacion(Object o) {
        return 0;
    }
}