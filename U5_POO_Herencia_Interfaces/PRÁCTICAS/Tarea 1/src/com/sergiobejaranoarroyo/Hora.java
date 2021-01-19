package com.sergiobejaranoarroyo;

public class Hora {
    /*****************/
    /** ACTIVIDAD 1 **/
    /*****************/

    protected int hora;
    protected int minutos;

    public Hora(int hora, int minutos) {
        this.hora = 0;
        this.minutos = 0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (0 <= hora && hora < 24) {
            this.hora = hora;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (0 <= minutos && minutos < 60) {
            this.minutos = minutos;
        }
    }

    public void inc() {
        minutos++;

        if (minutos > 59) {
            minutos = 0;

            hora++;

            if (hora > 23) {
                hora = 0;
            }
        }
    }

    @Override
    public String toString() {
        String result;
        result = hora + ":" + minutos;
        return result;
    }
}