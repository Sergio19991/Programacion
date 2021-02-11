package com.sergiobejaranoarroyo;

import java.util.Arrays;

public abstract class Participante extends Deporte {
    private String nombreAtleta;
    private int edadAtleta;

    public Participante(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes, String nombreDeporte, String nombrePabellon, Participante[] participantes, String nombreAtleta, int edadAtleta) {
        super(anoCelebracion, sede, paises, deportes, nombreDeporte, nombrePabellon, participantes);
        this.nombreAtleta = nombreAtleta;
        this.edadAtleta = edadAtleta;
    }

    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public int getEdadAtleta() {
        return edadAtleta;
    }

    public void setEdadAtleta(int edadAtleta) {
        this.edadAtleta = edadAtleta;
    }

    @Override
    public String toString() {
        return "Año de Celebración: " + anoCelebracion + "\n" +
                "Sede: " + sede + "\n" +
                "Países: " + Arrays.toString(paises) + "\n" +
                "Deportes: " + Arrays.toString(deportes) + "\n" +
                "Nombre del Atleta: " + nombreAtleta + "\n" +
                "Edad del Atleta" + edadAtleta +
                "\n";
    }
}