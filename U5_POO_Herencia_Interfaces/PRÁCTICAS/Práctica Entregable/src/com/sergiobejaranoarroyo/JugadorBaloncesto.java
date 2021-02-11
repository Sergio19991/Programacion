package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class JugadorBaloncesto extends Participante implements Encestar {
    private double altura;

    public JugadorBaloncesto(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes, String nombreDeporte, String nombrePabellon, Participante[] participantes, String nombreAtleta, int edadAtleta, double altura) {
        super(anoCelebracion, sede, paises, deportes, nombreDeporte, nombrePabellon, participantes, nombreAtleta, edadAtleta);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String juramento() {
        return "Yo " + getNombreAtleta() + ", como jugador de baloncesto, juro los valores deportivos mundiales." + "\n" +
                "Altura: " + altura;
    }

    @Override
    public String toString() {
        return "Altura: " + altura + "\n" +
                "Año de Celebración: " + anoCelebracion + "\n" +
                "Sede: " + sede + "\n" +
                "Países: " + Arrays.toString(paises) + "\n" +
                "Deportes: " + Arrays.toString(deportes) +
                "\n";
    }
}