package Ejercicio;

import com.google.gson.Gson;
import ejemplo_inicial.Alumno;

public class Main {
    public static void main(String[] args) {
        Asignatura asignatura1 = new Asignatura("LMSGI", 3);
        Asignatura asignatura2 = new Asignatura("FOL", 3);
        Asignatura asignatura3 = new Asignatura("SIINF", 6);
        Asignatura asignatura4 = new Asignatura("BADAT", 6);
        Asignatura asignatura5 = new Asignatura("PROGR", 8);
        Asignatura asignatura6 = new Asignatura("ENDES", 3);

        Gson gson = new Gson();

        String jso1_toJson = gson.toJson(asignatura1);
        System.out.println(jso1_toJson);
        String jso2_toJson = gson.toJson(asignatura2);
        System.out.println(jso2_toJson);
        String jso3_toJson = gson.toJson(asignatura3);
        System.out.println(jso3_toJson);
        String jso4_toJson = gson.toJson(asignatura4);
        System.out.println(jso4_toJson);
        String jso5_toJson = gson.toJson(asignatura5);
        System.out.println(jso5_toJson);
        String jso6_toJson = gson.toJson(asignatura6);
        System.out.println(jso6_toJson);

        System.out.println();

        String jso1_fromJson = gson.fromJson(asignatura1, Asignatura.class);
        System.out.println(jso1_fromJson);
        String jso2_fromJson = gson.fromJson(asignatura2, Asignatura.class);
        System.out.println(jso2_fromJson);
        String jso3_fromJson = gson.fromJson(asignatura3, Asignatura.class);
        System.out.println(jso3_fromJson);
        String jso4_fromJson = gson.fromJson(asignatura4, Asignatura.class);
        System.out.println(jso4_fromJson);
        String jso5_fromJson = gson.fromJson(asignatura5, Asignatura.class);
        System.out.println(jso5_fromJson);
        String jso6_fromJson = gson.fromJson(asignatura6, Asignatura.class);
        System.out.println(jso6_fromJson);
    }
}