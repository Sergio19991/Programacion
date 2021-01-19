package com.sergiobejaranoarroyo;

public class HoraExacta {
    /*****************/
    /** ACTIVIDAD 3 **/
    /*****************/
    protected int segundos;

    public HoraExacta(int hoora, int minutos, int segundos) {
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos <= 0 && segundos > 60) {
            this.segundos = segundos;
        }
    }

    public void inc() {
        segundos++;

        if (segundos > 60) {
            segundos = 0;
        }
    }

    @Override
    public String toString() {
        String resultado = super.toString();

        resultado += ":" + segundos;

        return resultado;
    }
}