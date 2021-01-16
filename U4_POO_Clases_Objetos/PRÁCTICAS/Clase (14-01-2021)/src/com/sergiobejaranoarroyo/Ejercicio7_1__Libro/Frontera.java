package com.sergiobejaranoarroyo.Ejercicio7_1__Libro;

import java.util.Arrays;
import java.util.Scanner;

public class Frontera {
    private Persona[] personas;

    public Frontera(Persona[] personas) {
        this.personas = personas;
    }

    public Frontera() {
        personas = new Persona[0];
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public void addPersona(Persona p) {
        personas = Arrays.copyOf(personas, personas.length + 1);

        personas[personas.length - 1] = p;
    }

    public void addPersonas(Persona[] gente) {
        int longitud = personas.length;

        personas = Arrays.copyOf(personas, personas.length + gente.length);

        for (int i = 0; i < gente.length; i++) {
            personas[longitud + i] = gente[i];
        }
    }

    public void pasoFrontera() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduce los Apellidos:");
        String apellidos = sc.nextLine();
        System.out.println("Introduce el DNI:");
        String dni = sc.nextLine();

        addPersona(new Persona(nombre, apellidos, dni));
    }

    public String busquedaPersonaNombre(String nombre) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(nombre)) {
                return personas[i].toString();
            }
        }

        return "NO EXISTE";
    }

    public String busquedaPersonaDNI(String dni) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(dni)) {
                return personas[i].toString();
            }
        }

        return "NO EXISTE";
    }

    @Override
    public String toString() {
        return "Frontera{" +
                "personas=" + Arrays.toString(personas) +
                '}';
    }
}