package com.sergiobejaranoarroyo.Ejercicio7_3__Libro;

public class Punto {
    double componenteX;
    double componenteY;

    public Punto(double componenteX, double componenteY) {
        this.componenteX = componenteX;
        this.componenteY = componenteY;
    }

    public double getComponenteX() {
        return componenteX;
    }

    public void setComponenteX(double componenteX) {
        this.componenteX = componenteX;
    }

    public double getComponenteY() {
        return componenteY;
    }

    public void setComponenteY(double componenteY) {
        this.componenteY = componenteY;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "componenteX=" + componenteX +
                ", componenteY=" + componenteY +
                '}';
    }

    void desplaza(double dx) {
        this.componenteX += dx;
    }

    void distancia(double dx, double dy) {
        this.componenteX += dx;
        this.componenteY += dy;
    }

    double distanciaEuclidea(Punto otro) {
        double dx = 0, dy = 0;

        if (otro == null) {
            this.componenteX = dx - otro.componenteX;
            this.componenteY = dy - otro.componenteY;
        }

        return Math.sqrt(Math.pow(componenteX, 2) + Math.pow(componenteY, 2));
    }
}