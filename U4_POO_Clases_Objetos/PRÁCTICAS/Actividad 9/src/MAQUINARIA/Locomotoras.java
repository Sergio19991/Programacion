package MAQUINARIA;

import PERSONAL.Mecanicos;

public class Locomotoras {
    private String matricula;
    private int potencia;
    private int year;
    private Mecanicos mecanico;

    public Locomotoras(String matricula, int potencia, int year, Mecanicos mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.year = year;
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Mecanicos getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanicos mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotoras{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", year=" + year +
                ", mecanico=" + mecanico +
                '}';
    }
}