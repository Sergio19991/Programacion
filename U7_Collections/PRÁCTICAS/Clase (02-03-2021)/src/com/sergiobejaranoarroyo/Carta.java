package com.sergiobejaranoarroyo;

import java.util.Objects;

public class Carta {
    /**
     * EJERCICIO 2
     **/

    private String carta;
    private String palo;

    public Carta(String carta, String palo) {
        this.carta = carta;
        this.palo = palo;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta1 = (Carta) o;
        return carta.equals(carta1.carta) && palo.equals(carta1.palo);
    }

    @Override
    public String toString() {
        return carta + " - " + palo + "\n";
    }
}