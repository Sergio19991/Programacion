package com.sergiobejaranoarroyo;

public class Hora12 extends Hora {
    /*****************/
    /** ACTIVIDAD 2 **/
    /*****************/

    public enum Meridiano {AM, PM}

    protected Meridiano mer;

    public Hora12(int hora, int minutos, Meridiano mer) {
        super(hora, minutos);
        setHora(hora);
        this.mer = mer;
    }

    @Override
    public void setHora(int hora) {
        if (1 <= hora && hora <= 12) {
            this.hora = hora;
        }
    }

    @Override
    public void inc() {
        super.inc();

        if (hora > 12) {
            hora = 1;

            mer = mer == Meridiano.AM ? Meridiano.PM : Meridiano.AM;
        }
    }

    @Override
    public String toString() {
        String result;

        result = super.toString();

        result += " " + mer;

        return result;
    }
}