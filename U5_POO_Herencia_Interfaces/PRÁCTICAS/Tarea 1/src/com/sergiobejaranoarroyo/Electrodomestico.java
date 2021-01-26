package com.sergiobejaranoarroyo;

public abstract class Electrodomestico {
    /*****************/
    /** ACTIVIDAD 9 **/
    /*****************/

    protected double precioBase;
    protected double peso;
    protected Color color;
    protected Consumo consumo;

    public Electrodomestico() {
        this(100, 5, Color.blanco, Consumo.F);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, Color.blanco, Consumo.F);
    }

    public Electrodomestico(double precioBase, double peso, Color color, Consumo consumo) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public double getPrecioFinal() {
        return precioBase + precioConsumo() + precioPeso();
    }

    public double precioConsumo() {
        switch (this.consumo) {
            case A:
                return 100;
            case B:
                return 80;
            case C:
                return 60;
            case D:
                return 50;
            case E:
                return 30;
            default:
                F:
                return 10;
        }
    }

    public double precioPeso() {
        if (peso > 0 && peso < 30) {
            return 10;
        } else if (peso >= 30 && peso < 50) {
            return 60;
        } else if (peso >= 50 && peso < 80) {
            return 80;
        } else {
            return 100;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", peso=" + peso +
                ", color=" + color +
                ", consumo=" + consumo +
                ", precio final=" + getPrecioFinal() +
                '}';
    }
}