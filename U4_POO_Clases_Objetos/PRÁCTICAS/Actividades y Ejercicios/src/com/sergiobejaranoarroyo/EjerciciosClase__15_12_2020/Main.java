package com.sergiobejaranoarroyo.EjerciciosClase__15_12_2020;

public class Main {
    public static void main(String[] args) {
        Persona alumno = new Persona("Pepe", (byte) 23, 1.75);
        Persona.numPersonas++;
        Persona profesor = new Persona();
        Persona.numPersonas++;
        Persona director = new Persona();
        Persona.numPersonas++;

        Vehiculo moto = new Vehiculo();
        Vehiculo coche = new Vehiculo();
        Vehiculo camion = new Vehiculo();

        /** PERSONAS **/
        //Alumno:
        alumno.nombre = "Sergio";
        alumno.edad = 21;
        alumno.estatura = 1.81;
        alumno.telefono = 987654321;
        alumno.dni = "12345678-L";

        //Profesor:
        profesor.nombre = "Diego";
        profesor.edad = 47;
        profesor.estatura = 1.75;
        profesor.telefono = 95135796;
        profesor.dni = "2569874-Ñ";

        //Director:
        director.nombre = "Jaime";
        director.edad = 51;
        director.estatura = 1.73;
        director.telefono = 987521036;
        director.dni = "6987201-K";


        /** VEHÍCULOS **/
        //Moto:
        moto.marca = "Kawasaki";
        moto.modelo = "z900";
        moto.matricula = "7845GTH";
        moto.cilindrada = 948;
        moto.color = "Verde";

        //Coche:
        coche.marca = "Ford";
        coche.modelo = "Mustang GT";
        coche.matricula = "6985GLP";
        coche.cilindrada = 421;
        coche.color = "Azul";

        //Camión:
        camion.marca = "Mercedes Benz";
        camion.modelo = "Actros E6";
        camion.matricula = "7432RMB";
        camion.cilindrada = 1200;
        camion.color = "Blanco";


        /** UTILIZANDO LAS FUNCIONES DEFINIDAS EN "Persona" **/
        alumno.saludar();
        alumno.cumplirAnos();
        System.out.println(profesor);
        System.out.println(profesor.esViejo());
        alumno.cumplirAnos();
        director.crecer(3);
        System.out.println("El Número de Personas creadas, es " + Persona.numPersonas + ".");

        coche.decirColor();
    }
}