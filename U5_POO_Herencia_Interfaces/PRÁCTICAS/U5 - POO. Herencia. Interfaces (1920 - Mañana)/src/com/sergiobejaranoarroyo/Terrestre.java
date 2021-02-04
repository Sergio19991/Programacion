package com.sergiobejaranoarroyo;

import java.util.Objects;

public abstract class Terrestre extends Vehiculo implements Comparable {
    enum Tipo {COCHE, MOTOCICLETA}

    ;
    protected String matricula;
    protected int anoMatriculacion;

    enum Color {AZUL, AMARILLO, ROJO, VERDE}

    ;

    public Terrestre(String nombreVehiculo, int numeroPersonas, String matricula, int anoMatriculacion) {
        super(nombreVehiculo, numeroPersonas);
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
        return "Terrestre{" +
                "matricula='" + matricula + '\'' +
                ", anoMatriculacion=" + anoMatriculacion +
                ", nombreVehiculo='" + nombreVehiculo + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return matricula.equals(terrestre.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    /*@Override*/
    public int compareTo_Matricula(Object matricula) {
        return 0;
    }

    /*@Override*/
    public int compareTo_AnoFabricacion(Object matricula) {
        return 0;
    }
}