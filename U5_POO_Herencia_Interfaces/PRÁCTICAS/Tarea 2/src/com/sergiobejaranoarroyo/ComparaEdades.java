package com.sergiobejaranoarroyo;

import java.util.Comparator;

public class ComparaEdades implements Comparator {
    /*****************/
    /** ACTIVIDAD 2 **/
    /*****************/

    @Override
    public int compare(Object o1, Object o2) {
        return ((Cliente) o1).edad - ((Cliente) o2).edad;
    }
}