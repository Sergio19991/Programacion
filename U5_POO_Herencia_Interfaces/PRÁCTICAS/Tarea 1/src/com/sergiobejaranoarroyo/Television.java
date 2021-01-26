package com.sergiobejaranoarroyo;

public class Television extends Electrodomestico {
    /*****************/
    /** ACTIVIDAD 9 **/
    /*****************/

    private double resoulucion;
    private boolean tdt;

    public Television() {
        super();
        this.resoulucion = 20;
        this.tdt = false;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resoulucion = 20;
        this.tdt = false;
    }

    public Television(double precioBase, double peso, Color color, Consumo consumo, double resoulucion, boolean tdt) {
        super(precioBase, peso, color, consumo);
        this.resoulucion = resoulucion;
        this.tdt = tdt;
    }

    public double getResoulucion() {
        return resoulucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    @Override
    public double getPrecioFinal() {
        return super.getPrecioFinal() + (resoulucion > 40 ? super.getPrecioFinal() * 0.3 : 0) + (true ? 50 : 0);
    }

    @Override
    public String toString() {
        return "Television{" +
                "precioBase=" + precioBase +
                ", peso=" + peso +
                ", color=" + color +
                ", consumo=" + consumo +
                ", resoulucion=" + resoulucion +
                ", tdt=" + tdt +
                ", precio final " + getPrecioFinal() +
                '}';
    }
}