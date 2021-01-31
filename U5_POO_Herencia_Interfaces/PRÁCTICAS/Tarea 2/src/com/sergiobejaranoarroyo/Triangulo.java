package com.sergiobejaranoarroyo;

public class Triangulo extends PoligonoRegular {
    /*****************/
    /** ACTIVIDAD 3 **/
    /*****************/

    private double altura;

    public Triangulo(double lado, Color color) {
        super(lado, color);
    }

    @Override
    public double getArea() {
        return (lado * altura) / 2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado=" + lado +
                ", color=" + color +
                ", altura=" + altura +
                '}';
    }
}