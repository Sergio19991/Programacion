package com.sergiobejaranoarroyo;

import java.util.Arrays;

public abstract class Pais extends Edicion {
    private String nombrePais;
    private int numeroParticipantes;

    public Pais(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes, String nombrePais, int numeroParticipantes) {
        super(anoCelebracion, sede, paises, deportes);
        this.nombrePais = nombrePais;
        this.numeroParticipantes = numeroParticipantes;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    @Override
    public String toString() {
        return "Año de Celebración: " + anoCelebracion + "\n" +
                "Sede: " + sede + "\n" +
                "Píses" + Arrays.toString(paises) + "\n" +
                "Deportes: " + Arrays.toString(deportes) + "\n" +
                "Nombre del País: " + nombrePais + "\n" +
                "Número de Participantes: " + numeroParticipantes +
                "\n";
    }
}