package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Judo extends Deporte {
    private int numeroTatamis;

    public Judo(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes, String nombreDeporte, String nombrePabellon, Participante[] participantes, int numeroTatamis) {
        super(anoCelebracion, sede, paises, deportes, nombreDeporte, nombrePabellon, participantes);
        this.numeroTatamis = numeroTatamis;
    }

    public int getNumeroTatamis() {
        return numeroTatamis;
    }

    public void setNumeroTatamis(int numeroTatamis) {
        this.numeroTatamis = numeroTatamis;
    }

    @Override
    public String toString() {
        return "Número de Tatamis: " + numeroTatamis + "\n" +
                "Año de Celebración: " + anoCelebracion + "\n" +
                "Sede: " + sede + "\n" +
                "Países: " + Arrays.toString(paises) + "\n" +
                "Deportes: " + Arrays.toString(deportes) +
                "\n";
    }
}