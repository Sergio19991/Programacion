package com.sergiobejaranoarroyo;

public class Suite {
    public static void main(String[] args) {
        IntroducirAspirantes introduccion = new IntroducirAspirantes();
        introduccion.introducir_aspirantes();

        Calificaciones calificaciones = new Calificaciones();
        calificaciones.poner_notas();

        Aprobados aprobados = new Aprobados();
        aprobados.cargar_aspirantes();
        aprobados.cargar_notas();
        aprobados.calcular_medias();
        aprobados.generarInforme();
    }
}