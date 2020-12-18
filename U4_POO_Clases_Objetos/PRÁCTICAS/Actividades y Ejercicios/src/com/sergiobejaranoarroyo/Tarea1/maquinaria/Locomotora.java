package com.sergiobejaranoarroyo.Tarea1.maquinaria;

import com.sergiobejaranoarroyo.Tarea1.personal.Mecanico;

public class Locomotora {
    String matricula;
    int potencia;
    int anoFabricacion;
    Mecanico mec;

    public Locomotora(String matricula, int potencia, int anoFabricacion, Mecanico mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anoFabricacion = anoFabricacion;
        this.mec = mec;
    }
}