package com.sergiobejaranoarroyo;

public class Prenda {
    public double precio;
    public String nombre;
    public int codigoBarras;
    public double peso;
    EstadoPrenda estadoPrenda;
    public double altura;

    public Prenda(double precio, String nombre, int codigoBarras, double peso, EstadoPrenda estadoPrenda, double altura) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.peso = peso;
        if (estadoPrenda == EstadoPrenda.prendaColgada) {
            this.altura = altura;
        }
    }

    public Prenda(double precio, String nombre, int codigoBarras, double peso, EstadoPrenda estadoPrenda) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.peso = peso;
        this.estadoPrenda = estadoPrenda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public EstadoPrenda getEstadoPrenda() {
        return estadoPrenda;
    }

    public void setEstadoPrenda(EstadoPrenda estadoPrenda) {
        this.estadoPrenda = estadoPrenda;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codigoBarras=" + codigoBarras +
                ", peso=" + peso +
                ", estadoPrenda=" + estadoPrenda +
                ", altura=" + altura +
                '}';
    }

    public void devolver() {
        System.out.println("Devolciendo la prenda con nombre " + getNombre() + " y precio " + getPrecio());
    }

    public void doblar() {
        if (estadoPrenda == EstadoPrenda.GENERAL) {
            System.out.println("La prenda " + getNombre() + " se peude doblar");
        } else if (estadoPrenda == EstadoPrenda.prendaColgada) {
            System.out.println("La prenda " + getNombre() + " no se puede doblar");
        }
    }

    public void colgar() {
        if (estadoPrenda == EstadoPrenda.prendaColgada) {
            System.out.println("La prenda " + getNombre() + " está colgada");
        }
    }
}