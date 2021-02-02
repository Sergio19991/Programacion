package com.sergiobejaranoarroyo;

public class Coche extends Vehiculo {
    /*****************/
    /** EJERCICIO 2 **/
    /*****************/

    private String marca, modelo;

    public Coche(int vehiculosCreados, int kilometrosTotales, int kilometrosRecorridos, String marca, String modelo) {
        super(vehiculosCreados, kilometrosTotales, kilometrosRecorridos);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", vehiculosCreados=" + vehiculosCreados +
                ", kilometrosTotales=" + kilometrosTotales +
                ", kilometrosRecorridos=" + kilometrosRecorridos +
                '}';
    }
}