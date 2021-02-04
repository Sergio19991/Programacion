package com.sergiobejaranoarroyo;

import java.util.Objects;

public class Coche extends Terrestre implements Comparable {
    protected String matricula;
    protected int anoFabricacion;
    protected Color colorCoche;

    public Coche(String nombre, int numeroPersonas, String matricula, int anoFabricacion, Color colorCoche) {
        super(nombre, numeroPersonas);
        this.matricula = matricula;
        this.anoFabricacion = anoFabricacion;
        this.colorCoche = colorCoche;
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

    public Color getColorCoche() {
        return colorCoche;
    }

    public void setColorCoche(Color colorCoche) {
        this.colorCoche = colorCoche;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", anoFabricacion=" + anoFabricacion +
                ", colorCoche=" + colorCoche +
                ", nombre='" + nombre + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return matricula.equals(coche.matricula);
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