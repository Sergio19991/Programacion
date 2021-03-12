package com.sergiobejaranoarroyo;

public class Main {

    public static void main(String[] args) {
        Unidad unidad1 = new Unidad("UNIDAD 1");
        Unidad unidad2 = new Unidad("UNIDAD 2");
        Unidad unidad3 = new Unidad("UNIDAD 3");

        Alumno alumno1 = new Alumno("ALUMNO 1", "APELLIDOS 1", "111111111A", 1, unidad1);
        Alumno alumno2 = new Alumno("ALUMNO 2", "APELLIDOS 2", "222222222B", 2, unidad2);
        Alumno alumno3 = new Alumno("ALUMNO 3", "APELLIDOS 3", "333333333C", 3, unidad3);
        Alumno alumno4 = new Alumno("ALUMNO 4", "APELLIDOS 4", "444444444D", 4, unidad1);
        Alumno alumno5 = new Alumno("ALUMNO 5", "APELLIDOS 5", "555555555E", 5, unidad2);
        Alumno alumno6 = new Alumno("ALUMNO 6", "APELLIDOS 6", "666666666F", 6, unidad3);
        Alumno alumno7 = new Alumno("ALUMNO 7", "APELLIDOS 7", "777777777G", 7, unidad1);
        Alumno alumno8 = new Alumno("ALUMNO 8", "APELLIDOS 8", "888888888H", 8, unidad2);
        Alumno alumno9 = new Alumno("ALUMNO 9", "APELLIDOS 9", "999999999I", 9, unidad3);
        Alumno alumno10 = new Alumno("ALUMNO 10", "APELLIDOS 10", "123456789J", 10, unidad1);

        unidad1.guardarAlumnos();
        unidad2.guardarAlumnos();
        unidad3.guardarAlumnos();

        unidad1.mostrarAlumnosUnidad("UNIDAD 1");
        unidad2.mostrarAlumnosUnidad("UNIDAD 2");
        unidad3.mostrarAlumnosUnidad("UNIDAD 3");
    }
}