package com.sergiobejaranoarroyo.Actividad1;

public class Cliente {
    private String nombre;
    private String apellidos;
    private int edad;

    public Cliente(String nombre, String apellidos, int edad) throws EdadErroneaException, MenorEdadException {
        this.nombre = nombre;
        this.apellidos = apellidos;
        if (edad < 0 || edad > 100) {
            throw new EdadErroneaException("EDAD ERRONEA");
        } else if (edad < 18) {
            throw new MenorEdadException("MENOR DE EDAD");
        } else {
            this.edad = edad;
        }
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadErroneaException, MenorEdadException {
        if (edad < 0 || edad > 100) {
            throw new EdadErroneaException("EDAD ERRONEA");
        } else if (edad < 18) {
            throw new MenorEdadException("MENOR DE EDAD");
        } else {
            this.edad = edad;
        }
        this.edad = edad;
    }
}