package com.sergiobejaranoarroyo;

public class Campana extends Instrumento {
    /*****************/
    /** ACTIVIDAD 6 **/
    /*****************/

    public Campana() {
        super();
    }

    //@Override
    public void interpretarCampana() {
        for (int i = 0; i < numNotas; i++) {
            switch (notas[i]) {
                case DO:
                    System.out.println("Dolonnnnn");
                    break;
                case RE:
                    System.out.println("Reeeeen");
                    break;
                case MI:
                    System.out.println("Miiiii");
                    break;
                case FA:
                    System.out.println("Faaaaa");
                    break;
                case SOL:
                    System.out.println("Soooool");
                    break;
                case LA:
                    System.out.println("Laaaaaa");
                    break;
                case SI:
                    System.out.println("Siiiiiii");
                    break;
            }
        }

        System.out.println("");
    }
}