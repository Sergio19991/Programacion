package com.sergiobejaranoarroyo;

public class Maraton {
    private String numeroDorsal;

    public Maraton(String numeroDorsal) {
        this.numeroDorsal = numeroDorsal;
    }

    public String getNumeroDorsal() {
        return numeroDorsal;
    }

    public void setNumeroDorsal(String numeroDorsal) {
        this.numeroDorsal = numeroDorsal;
    }

    @Override
    public String toString() {
        return "Número del Dorsal: " + numeroDorsal;
    }
}