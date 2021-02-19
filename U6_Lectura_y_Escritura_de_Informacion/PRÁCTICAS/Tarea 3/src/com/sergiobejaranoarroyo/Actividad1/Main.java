package com.sergiobejaranoarroyo.Actividad1;

public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente1 = new Cliente("CLIENTE 1", "APELLIDOS 1", 20);
        } catch (EdadErroneaException e) {
            e.printStackTrace();
        } catch (MenorEdadException e) {
            e.printStackTrace();
        }

        try {
            Cliente cliente2 = new Cliente("CLIENTE 2", "APELLIDOS 2", 110);
        } catch (EdadErroneaException e) {
            e.printStackTrace();
        } catch (MenorEdadException e) {
            e.printStackTrace();
        }

        try {
            Cliente cliente3 = new Cliente("CLIENTE 3", "APELLIDOS 3", 12);
        } catch (EdadErroneaException e) {
            e.printStackTrace();
        } catch (MenorEdadException e) {
            e.printStackTrace();
        }
    }
}