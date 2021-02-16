package com.sergiobejaranoarroyo;

public class CamionPerchas extends Vehiculo {
    EstadoPrenda estadoPrendas = EstadoPrenda.prendaColgada;
    public int numeroPrendas;

    public CamionPerchas(String nombre, String apellidos, int nss, String matricula, double cargaMaxima, Conductor conductor, EstadoPrenda estadoPrendas, int numeroPrendas) {
        super(nombre, apellidos, nss, matricula, cargaMaxima, conductor);
        this.estadoPrendas = estadoPrendas;
        this.numeroPrendas = numeroPrendas;
    }

    public EstadoPrenda getEstadoPrendas() {
        return estadoPrendas;
    }

    public void setEstadoPrendas(EstadoPrenda estadoPrendas) {
        this.estadoPrendas = estadoPrendas;
    }

    public int getNumeroPrendas() {
        return numeroPrendas;
    }

    public void setNumeroPrendas(int numeroPrendas) {
        this.numeroPrendas = numeroPrendas;
    }

    @Override
    public String toString() {
        return "CamionPerchas{" +
                "estadoPrendas=" + estadoPrendas +
                ", numeroPrendas=" + numeroPrendas +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nss=" + nss +
                ", matricula='" + matricula + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", conductor=" + conductor +
                '}';
    }

    public String descargar() {
        return "Descargando " + getNumeroPrendas() + " Prendas.";
    }
}