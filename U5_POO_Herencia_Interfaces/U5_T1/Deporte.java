package com.sergiobejaranoarroyo;

import java.util.Arrays;

public abstract class Deporte extends Edicion {
    private String nombreDeporte;
    private String nombrePabellon;
    private Participante[] participantes;

    public Deporte(int anoCelebracion, String sede, Pais[] paises, Deporte[] deportes, String nombreDeporte, String nombrePabellon, Participante[] participantes) {
        super(anoCelebracion, sede, paises, deportes);
        this.nombreDeporte = nombreDeporte;
        this.nombrePabellon = nombrePabellon;
        this.participantes = participantes;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getNombrePabellon() {
        return nombrePabellon;
    }

    public void setNombrePabellon(String nombrePabellon) {
        this.nombrePabellon = nombrePabellon;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public boolean anadirParticipante(Participante nuevoParticipante) {
        if (participantes != null) {
            if (participantes.length == Double.POSITIVE_INFINITY) {
                return false;
            } else {
                Participante[] par1 = new Participante[participantes.length + 1];
                for (int i = 0; i < participantes.length; i++) {
                    par1[i] = participantes[i];
                }
                par1[participantes.length] = nuevoParticipante;
                participantes = par1;
                return true;
            }
        } else {
            participantes = new Participante[1];
            participantes[0] = nuevoParticipante;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Nombre del Deporte: " + nombreDeporte + "\n" +
                "Nombre del Pabellón: " + nombrePabellon + "\n" +
                "Participantes: " + Arrays.toString(participantes) + "\n" +
                "Año de Celebración: " + anoCelebracion + "\n" +
                "Sede: " + sede + "\n" +
                "Países: " + Arrays.toString(paises) + "\n" +
                "Deportes: " + Arrays.toString(deportes) + "\n" +
                "\n";
    }

    public void mostrarParticipantes() {
        System.out.println(Arrays.toString(participantes));
    }

    public void mostrarJugadoresBaloncestoPorAltura() {
        System.out.println(Arrays.toString(participantes));
    }
}