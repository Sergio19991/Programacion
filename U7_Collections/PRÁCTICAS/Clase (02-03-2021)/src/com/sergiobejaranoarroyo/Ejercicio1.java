package com.sergiobejaranoarroyo;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List listaMonedas = new ArrayList<Moneda>();
        String[] valores = {"1 céntimos", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
        String[] posicion = {"cara", "cruz"};
        String v = valores[(int) (Math.random() * 8)];
        String p = posicion[Math.random() > 0.5 ? 1 : 0];
        Moneda previa = new Moneda(v, p);

        while (listaMonedas.size() < 7) {
            String v1 = valores[(int) (Math.random() * 8)];
            String p1 = posicion[Math.random() > 0.5 ? 1 : 0];

            if ((v1 == previa.getMoneda() && p1 != previa.getPosicion()) || (v1 != previa.getMoneda() && p1 == previa.getPosicion())) {
                Moneda m = new Moneda(v1, p1);
                listaMonedas.add(m);
                previa = m;
            }
        }

        System.out.println(listaMonedas);
    }
}