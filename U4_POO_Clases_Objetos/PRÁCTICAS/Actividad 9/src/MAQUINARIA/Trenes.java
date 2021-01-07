package MAQUINARIA;

import PERSONAL.Maquinistas;

public class Trenes {
    Locomotoras locomotoras;
    Vagones vagones[];
    Maquinistas responsable;
    int numeroVagones;

    public Trenes(Locomotoras locomotoras, Maquinistas responsable) {
        this.locomotoras = locomotoras;
        this.responsable = responsable;

        vagones = new Vagones[5];
        numeroVagones = 0;
    }
}