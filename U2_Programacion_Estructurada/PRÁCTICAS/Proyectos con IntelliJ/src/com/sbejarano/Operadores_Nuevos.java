package com.sbejarano;

public class Operadores_Nuevos {
    public static void main(String[] args) {

        int a = 0;

        /*
        a = a+2; //a vale 2
        a += 2; //a vale 2, pero de otra forma

        a = a+10; //a vale 20
        a *=10; //a vale 20, pero de ota forma

        a=10;
        a -= 5; // a = a -5
         */

        System.out.println("El valor inicial:" + a);   //Vale 0 porque es valor que le hemos asignado a a.

        // ++a (pre-decremento) y a++ (pos-decremento)

        System.out.println("El valor inicial:" + (++a));   //Vale 1 porque a incrementado 1, es decir. ha sumado un 1.

        System.out.println("El valor inicial:" + (+a));   //Vale 1 porque le ha smado 1 después de ejecutar toda la instrucción.

        System.out.println("El valor inicial:" + (++a));   //Vale 2 porque le ha sumado 1 al valor anterior.

        System.out.println("El valor inicial:" + (++a));   //Vale 3 porque le ha sumndo 1 al valor anterior.

    }
}
