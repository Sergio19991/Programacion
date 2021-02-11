package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Atleta extends Participante implements Correr {
    private String nombrePrueba;

    public Atleta(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes, String nombreDeporte, String nombrePabellon, Participante[] participantes, String nombreAtleta, int edadAtleta, String nombrePrueba) {
        super(anoCelebracion, sede, paises, deportes, nombreDeporte, nombrePabellon, participantes, nombreAtleta, edadAtleta);
        this.nombrePrueba = nombrePrueba;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    public String juramento() {
        return "Yo " + getNombreAtleta() + ", como atleta, juro los valores deportivos mundiales." + "\n" +
                "Nombre de la Prueba: " + nombrePrueba;
    }

    @Override
    public String toString() {
        return "Nombre de la Prueba: " + nombrePrueba + "\n" +
                "Año de Celebración: " + anoCelebracion + "\n" +
                "Sede: " + sede + "\n" +
                "Países: " + Arrays.toString(paises) + "\n" +
                "Deportes: " + Arrays.toString(deportes) +
                "\n";
    }
}