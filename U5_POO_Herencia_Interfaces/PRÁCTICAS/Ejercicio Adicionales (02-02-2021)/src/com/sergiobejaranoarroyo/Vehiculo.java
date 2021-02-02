package com.sergiobejaranoarroyo;

public class Vehiculo {
    /*****************/
    /** EJERCICIO 1 **/
    /*****************/

    protected int vehiculosCreados;
    protected int kilometrosTotales;
    protected int kilometrosRecorridos;

    public Vehiculo(int vehiculosCreados, int kilometrosTotales, int kilometrosRecorridos) {
        this.vehiculosCreados = vehiculosCreados;
        this.kilometrosTotales = kilometrosTotales;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public void setVehiculosCreados(int vehiculosCreados) {
        this.vehiculosCreados = vehiculosCreados;
    }

    public int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public void setKilometrosTotales(int kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "vehiculosCreados=" + vehiculosCreados +
                ", kilometrosTotales=" + kilometrosTotales +
                ", kilometrosRecorridos=" + kilometrosRecorridos +
                '}';
    }
}