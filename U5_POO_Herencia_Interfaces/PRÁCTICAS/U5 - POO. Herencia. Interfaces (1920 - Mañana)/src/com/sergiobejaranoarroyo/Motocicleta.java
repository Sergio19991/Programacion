package com.sergiobejaranoarroyo;

import java.util.Objects;

public class Motocicleta extends Terrestre implements Comparable {
    protected String matricula;
    protected int anoFabricacion;
    protected Color colorMotocicleta;

    public Motocicleta(String nombre, int numeroPersonas, String matricula, int anoFabricacion, Color colorMotocicleta) {
        super(nombre, numeroPersonas);
        this.matricula = matricula;
        this.anoFabricacion = anoFabricacion;
        this.colorMotocicleta = colorMotocicleta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public Color getColorMotocicleta() {
        return colorMotocicleta;
    }

    public void setColorMotocicleta(Color colorMotocicleta) {
        this.colorMotocicleta = colorMotocicleta;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "matricula='" + matricula + '\'' +
                ", anoFabricacion=" + anoFabricacion +
                ", colorMotocicleta=" + colorMotocicleta +
                ", nombre='" + nombre + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motocicleta that = (Motocicleta) o;
        return matricula.equals(that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}