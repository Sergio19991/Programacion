package com.sergiobejaranoarroyo;

import java.util.Objects;

public class Lavadora extends Electrodomestico {
    /*****************/
    /** ACTIVIDAD 9 **/
    /*****************/

    private double carga;

    public Lavadora(double carga) {
        this.carga = 5;
    }

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso, Color color, Consumo consumo, double carga) {
        super(precioBase, peso, color, consumo);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double getPrecioFinal() {
        return super.getPrecioFinal() + (carga > 30 ? 50 : 0);
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precioBase=" + precioBase +
                ", peso=" + peso +
                ", color=" + color +
                ", consumo=" + consumo +
                ", carga=" + carga +
                ", precio final" + getPrecioFinal() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lavadora lavadora = (Lavadora) o;
        return Double.compare(lavadora.getPrecioFinal(), this.getPrecioFinal()) == 0;
    }
}