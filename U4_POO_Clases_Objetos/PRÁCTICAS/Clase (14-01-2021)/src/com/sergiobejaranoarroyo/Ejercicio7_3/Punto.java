package com.sergiobejaranoarroyo.Ejercicio7_3;

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
        this.componenteX+=dx;

        for (int i = 1; i < dx; i++) {
            this.componenteX+=i;
        }
    }

    void distancia(double dx, double dy) {
        this.componenteX+=dx;
        this.componenteY+=dy;

        for (int i = 0; i < dx; i++) {
            for (int j = 0; j < dy; j++) {
                this.componenteX+=i;
                this.componenteY+=j;
            }
        }
    }

    /*double distanciaEuclidea(Punto otro) {

    }*/


}
