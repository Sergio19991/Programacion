package MAQUINARIA;

import PERSONAL.Maquinistas;

import java.util.Arrays;

public class Trenes {
    private Maquinistas maquinista;
    private Locomotoras locomotora;
    static final int capcidad = 5;
    private Vagones[] vagones;

    public Trenes(Maquinistas maquinista, Locomotoras locomotora, Vagones[] vagones) {
        this.maquinista = maquinista;
        this.locomotora = locomotora;
        if (vagones.length <= Trenes.capcidad) {
            this.vagones = vagones;
        } else {
            vagones = new Vagones[5];
        }
    }

    public Trenes(Maquinistas maquinista, Locomotoras locomotora) {
        this(maquinista, locomotora, new Vagones[5]);
    }

    public boolean addVagon(Vagones v) {
        if (this.vagones.length < 5) {
            this.vagones = Arrays.copyOf(this.vagones, this.vagones.length + 1);
            this.vagones[this.vagones.length - 1] = v;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeVagone() {
        if (this.vagones.length > 0) {
            this.vagones = Arrays.copyOf(this.vagones, this.vagones.length - 1);
            return true;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Trenes{" +
                "maquinista=" + maquinista +
                ", locomotora=" + locomotora +
                ", vagones=" + Arrays.toString(vagones) +
                '}';
    }
}