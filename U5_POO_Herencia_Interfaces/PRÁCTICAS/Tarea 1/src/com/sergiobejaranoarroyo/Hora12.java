package com.sergiobejaranoarroyo;

public class Hora12 extends Hora {
    String franja;

    public Hora12(Integer hora, Integer min) {
        /*if (hora > 12 || hora < 0 || min < 0 || min > 59) {
            this.hora = 12;
            this.min = 0;
            this.franja = "pm";
        } else {
            this.hora = hora;
            this.min = min;
            this.franja = franja;
        }*/

        this.franja = franja;
    }

    public String getFranja() {
        return franja;
    }

    public void setFranja(String franja) {
        this.franja = franja;
    }

    @Override
    public void setHora(Integer hora) {
        if (hora >= 0 && hora <= 12) {
            this.hora = hora;
        }
    }

    @Override
    public void inc() {
        min++;
        hora++;
        if (min > 59) {
            hora++;
            min = 0;

        } else {
            min++;
        }

        hora=0;
        min=0;

        if (hora < 12 && min > 59) {
            min++;
            hora = 0;
        } else {
            hora++;
        }


        if ((franja="pm" && hora=11)||(franja="am" && hora=11) || (franja="pm" && hora=12)) {
            
        }

        if ()
    }
}