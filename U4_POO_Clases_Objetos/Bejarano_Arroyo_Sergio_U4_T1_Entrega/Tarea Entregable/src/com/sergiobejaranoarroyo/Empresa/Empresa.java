package com.sergiobejaranoarroyo.Empresa;

import java.util.Arrays;

public class Empresa {
    String nombre;
    Departamento[] departamentos;

    public Empresa(String nombre, Departamento[] departamentos) {
        this.nombre = nombre;
        this.departamentos = departamentos;
    }

    /**
     * PERMITE AÑADIR DEPARTAMENTOS:
     **/
    public boolean anadirDepartamentos(Departamento nuevoDepartamento) {
        if (this.departamentos.length < departamentos.length + 1) {
            this.departamentos = Arrays.copyOf(this.departamentos, this.departamentos.length + 1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * PERMITE MOSTRAR LA LISTA DE DEPARTAMENTOS:
     **/
    public void mostrarListaDepartamentos() {
        System.out.println(Arrays.toString(departamentos));
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }

    /**
     * PERMITE CONCER EL NÚMERO DE OBJETOS CREADOS:
     **/
    public void numeroObjetos(Empleado empleados, Departamento departamentos) {
        System.out.print("Número de Empleados:");
        int empladosCreados = 0;
        for (int i = 0; i < empleados.nombreCompleto.length(); i++) {
            empladosCreados++;
        }
        System.out.println(empladosCreados);

        System.out.print("Número de Departamentos:");
        int departamentosCreados = 0;
        for (int i = 0; i < departamentosCreados; i++) {
            departamentosCreados++;
        }
        System.out.println(departamentosCreados);
    }
}