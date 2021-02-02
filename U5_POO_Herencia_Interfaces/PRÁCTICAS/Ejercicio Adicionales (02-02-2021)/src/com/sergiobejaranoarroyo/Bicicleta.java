package com.sergiobejaranoarroyo;

public class Bicicleta extends Vehiculo {
    /*****************/
    /** EJERCICIO 1 **/
    /*****************/

    private String color;

    public Bicicleta(int vehiculosCreados, int kilometrosTotales, int kilometrosRecorridos, String color) {
        super(vehiculosCreados, kilometrosTotales, kilometrosRecorridos);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "color='" + color + '\'' +
                ", vehiculosCreados=" + vehiculosCreados +
                ", kilometrosTotales=" + kilometrosTotales +
                ", kilometrosRecorridos=" + kilometrosRecorridos +
                '}';
    }
}