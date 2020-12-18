package com.sergiobejaranoarroyo.Tarea1.maquinaria;

import com.sergiobejaranoarroyo.Tarea1.personal.Maquinista;

public class Tren {
    Locomotora locomotora;
    Vagon vagones[];
    Maquinista responsable;
    private int numeroVagones;

    public Tren(Locomotora locomotora, Maquinista responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;

        vagones = new Vagon[5];
        numeroVagones = 0;
    }

    public void enganchaVagon(int capacidadMaxima, int capacidadActual, String mercancia) {
        if (numeroVagones < 5) {
            System.out.println("El Tren no admite más Vagones.");
        } else {
            Vagon v = new Vagon(capacidadMaxima, capacidadActual, mercancia);
            vagones[numeroVagones] = v;
            numeroVagones++;
        }
    }
}