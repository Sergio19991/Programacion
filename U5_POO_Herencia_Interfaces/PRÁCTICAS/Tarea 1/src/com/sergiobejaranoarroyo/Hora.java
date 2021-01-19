package com.sergiobejaranoarroyo;

public class Hora {
    protected Integer hora;
    protected Integer min;

    public Hora(Integer hora, Integer min) {
        if (hora < 0 || hora > 24 || min > 59 || min < 0) {
            this.hora = 12;
            this.min = 0;
        } else {
            this.hora = hora;
            this.min = min;
        }
    }

    public Hora() {
        this(12, 0);
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        if (min >= 0 && min <= 59) {
            this.min = min;
        }
    }

    public void inc() {
        min++;

        if (min > 59) {
            hora++;
            min = 0;

            if (hora > 23) hora = 0;
        }
    }
}