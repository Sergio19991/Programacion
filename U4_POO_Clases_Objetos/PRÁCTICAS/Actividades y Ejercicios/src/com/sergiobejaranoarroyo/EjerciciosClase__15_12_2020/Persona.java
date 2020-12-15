package com.sergiobejaranoarroyo.EjerciciosClase__15_12_2020;

public class Persona {
    String nombre;
    byte edad;
    double estatura;
    int telefono;
    String dni;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", telefono=" + telefono +
                ", dni='" + dni + '\'' +
                '}';
    }

    public boolean esViejo() {
        if (edad > 18) {
            return true;
        }

        return false;
    }

    public void saludar() {
        System.out.println("Hola, encantado de conocerte. Me llamo " + nombre.toUpperCase());
    }

    public void cumplirAnos() {
        System.out.println(edad++);
    }

    public void crecer(double incremento) {
        System.out.println(estatura += incremento);
    }
}