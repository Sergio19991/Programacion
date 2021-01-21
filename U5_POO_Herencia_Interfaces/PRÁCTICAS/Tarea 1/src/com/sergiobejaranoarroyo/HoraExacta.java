package com.sergiobejaranoarroyo;

public class HoraExacta extends Hora {
    /*****************/
    /** ACTIVIDAD 3 **/
    /*****************/
    protected int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        setSegundos(segundos);
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


    /*****************/
    /** ACTIVIDAD 4 **/
    /*****************/
    @Override
    public boolean equals(Object o) {
        HoraExacta otroReloj = (HoraExacta) o;

        boolean iguales;

        if (this.hora == otroReloj.hora && this.minutos == otroReloj.minutos && this.segundos == otroReloj.segundos) {
            iguales = true;
        } else {
            iguales = false;
        }

        return iguales;
    }
}