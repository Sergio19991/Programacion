package com.sergiobejaranoarroyo.Empresa;

import java.util.Arrays;

public class Departamento {
    String nombre;
    String sede;
    String extensonTelefono;

    Empleado[] empleados;

    public Departamento(String nombre, String sede, String extensonTelefono, Empleado[] empleados) {
        this.nombre = nombre;
        this.sede = "Castilleja";
        this.extensonTelefono = extensonTelefono;
        this.empleados = empleados;
    }

    /**
     * CONSTRUNCTOR SIN "sede":
     **/
    public Departamento(String nombre, String extensonTelefono, Empleado[] empleados) {
        this.nombre = nombre;
        this.extensonTelefono = extensonTelefono;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getExtensonTelefono() {
        return extensonTelefono;
    }

    public void setExtensonTelefono(String extensonTelefono) {
        this.extensonTelefono = extensonTelefono;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", sede='" + sede + '\'' +
                ", extensonTelefono='" + extensonTelefono + '\'' +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }

    /**
     * PERMITE AÑADIR EMPLEADOS:
     **/
    public boolean anadirEmpleado(Empleado nuevoEmpleado) {
        if (this.empleados.length < empleados.length + 1) {
            this.empleados = Arrays.copyOf(this.empleados, this.empleados.length + 1);
            this.empleados[this.empleados.length - 1] = nuevoEmpleado;
            return true;
        } else {
            return false;
        }
    }

    /**
     * PERMITE ELIMINAR EMPLEADOS
     **/
    public boolean eliminarEmpleado() {
        if (this.empleados.length < empleados.length + 1) {
            this.empleados = Arrays.copyOf(this.empleados, this.empleados.length - 1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * MUESTRA LA LISTA DE EMPLEADOS
     **/
    public void mostrarListaEmpleados() {
        System.out.println(Arrays.toString(empleados));
    }
}