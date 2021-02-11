package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Judoka extends Participante implements Luchar {
    private int categoria;

    public Judoka(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes, String nombreDeporte, String nombrePabellon, Participante[] participantes, String nombreAtleta, int edadAtleta, int categoria) {
        super(anoCelebracion, sede, paises, deportes, nombreDeporte, nombrePabellon, participantes, nombreAtleta, edadAtleta);
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String juramento() {
        return "Yo " + getNombreAtleta() + ", como judoka, juro los valores deportivos mundiales." + "\n" +
                "Categoría: " + categoria;
    }

    @Override
    public String toString() {
        return "Categoría: " + categoria + "\n" +
                "Año de Celebración: " + anoCelebracion + "\n" +
                "Sede: " + sede + "\n" +
                "Países: " + Arrays.toString(paises) + "\n" +
                "Deportes: " + Arrays.toString(deportes) +
                "\n";
    }
}