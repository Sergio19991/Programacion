package com.sergiobejaranoarroyo.Unidad2.Tarea4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio5 {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat hourFomat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(hourFomat.format(date));
    }
}