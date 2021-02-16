package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class CamionCajas extends Vehiculo {
    public int[] listaCajas = new int[5];
    public int maximoPrendas;
    public int id;
    public int numeroPrendas;

    public CamionCajas(String nombre, String apellidos, int nss, String matricula, double cargaMaxima, Conductor conductor, int[] listaCajas, int maximoPrendas, int id, int numeroPrendas) {
        super(nombre, apellidos, nss, matricula, cargaMaxima, conductor);
        this.listaCajas = listaCajas;
        this.maximoPrendas = maximoPrendas;
        this.id = id;
        this.numeroPrendas = numeroPrendas;
    }

    public int[] getListaCajas() {
        return listaCajas;
    }

    public void setListaCajas(int[] listaCajas) {
        this.listaCajas = listaCajas;
    }

    public int getMaximoPrendas() {
        return maximoPrendas;
    }

    public void setMaximoPrendas(int maximoPrendas) {
        this.maximoPrendas = maximoPrendas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroPrendas() {
        return numeroPrendas;
    }

    public void setNumeroPrendas(int numeroPrendas) {
        this.numeroPrendas = numeroPrendas;
    }

    @Override
    public String toString() {
        return "listaCajas=" + Arrays.toString(listaCajas) +
                ", maximoPrendas=" + maximoPrendas +
                ", id=" + id +
                ", numeroPrendas=" + numeroPrendas +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nss=" + nss +
                ", matricula='" + matricula + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", conductor=" + conductor +
                '}';
    }

    public String descargar() {
        return "Descargando " + getListaCajas() + " cajas y " + getNumeroPrendas() + " prendas.";
    }
}