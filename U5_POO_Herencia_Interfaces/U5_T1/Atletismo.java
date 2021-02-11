package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Atletismo extends Deporte {
    protected int numeroPruebas;

    public Atletismo(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes, String nombreDeporte, String nombrePabellon, Participante[] participantes, int numeroPruebas) {
        super(anoCelebracion, sede, paises, deportes, nombreDeporte, nombrePabellon, participantes);
        this.numeroPruebas = numeroPruebas;
    }

    public int getNumeroPruebas() {
        return numeroPruebas;
    }

    public void setNumeroPruebas(int numeroPruebas) {
        this.numeroPruebas = numeroPruebas;
    }

    @Override
    public String toString() {
        return "Número de Pruebas: " + numeroPruebas + "\n" +
                "Año de Celebración: " + anoCelebracion + "\n" +
                "Sede: " + sede + "\n" +
                "Países: " + Arrays.toString(paises) + "\n" +
                "Deportes: " + Arrays.toString(deportes) +
                "\n";
    }
}