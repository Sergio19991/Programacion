package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Baloncesto extends Deporte {
    private int numeroEquipos;

    public Baloncesto(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes, String nombreDeporte, String nombrePabellon, Participante[] participantes, int numeroEquipos) {
        super(anoCelebracion, sede, paises, deportes, nombreDeporte, nombrePabellon, participantes);
        this.numeroEquipos = numeroEquipos;
    }

    public int getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(int numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }

    @Override
    public String toString() {
        return "Número de Equipos: " + numeroEquipos + "\n" +
                "Año de Celebración: " + anoCelebracion + "\n" +
                "Sede: " + sede + "\n" +
                "Países: " + Arrays.toString(paises) + "\n" +
                "Deportes: " + Arrays.toString(deportes) +
                "\n";
    }
}