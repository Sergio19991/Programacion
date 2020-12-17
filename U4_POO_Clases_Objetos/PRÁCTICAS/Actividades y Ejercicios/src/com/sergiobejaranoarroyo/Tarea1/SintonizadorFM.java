package com.sergiobejaranoarroyo.Tarea1;

public class SintonizadorFM {
    private double frecuencia;

    SintonizadorFM() {
        frecuencia = 80;
    }

    SintonizadorFM(double frecuenciaInicial) {
        if (frecuenciaInicial < 80) {
            frecuencia = 80;
        } else if (frecuenciaInicial > 108) {
            frecuencia = 108;
        } else {
            frecuencia = frecuenciaInicial;
        }
    }

    private void comprobarRango() {
        if (frecuencia < 80) {
            frecuencia = 108;
        } else if (frecuencia > 108) {
            frecuencia = 80;
        }
    }

    public double bajar() {
        frecuencia -= 0.5;
        comprobarRango();
        return (frecuencia);
    }

    public double subir() {
        frecuencia += 0.5;
        comprobarRango();
        return frecuencia;
    }

    public void mostrarInformacionSintonizador() {
        System.out.println("Sintonizando: " + frecuencia + " MHz");
    }
}