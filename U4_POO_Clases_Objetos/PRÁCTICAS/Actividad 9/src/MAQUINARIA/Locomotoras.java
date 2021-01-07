package MAQUINARIA;

import PERSONAL.Mecanicos;

public class Locomotoras {
    String matricula;
    int potencia;
    int anoFabricacion;
    Mecanicos mec;

    public Locomotoras(String matricula, int potencia, int anoFabricacion, Mecanicos mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anoFabricacion = anoFabricacion;
        this.mec = mec;
    }
}