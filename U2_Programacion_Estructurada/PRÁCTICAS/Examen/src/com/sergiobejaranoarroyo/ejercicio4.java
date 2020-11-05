package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verdadero, falso;
        String pregunta1, pregunta2, pregunta3, pregunta4, pregunta5, pregunta6, pregunta7, pregunta8, pregunta9, pregunta10;
        int contador;

        verdadero = "verdadero";
        falso = "falso";
        contador = 3;


        /** PREGUNTAS: **/
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente:");
        pregunta1 = sc.nextLine();
        System.out.println("2. Ha aumentado sus gastos de vestuario:");
        pregunta2 = sc.nextLine();
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti:");
        pregunta3 = sc.nextLine();
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer):");
        pregunta4 = sc.nextLine();
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil:");
        pregunta5 = sc.nextLine();
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante:");
        pregunta6 = sc.nextLine();
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a:");
        pregunta7 = sc.nextLine();
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        pregunta8 = sc.nextLine();
        System.out.println("9. Has notado que últimamente se perfuma más:");
        pregunta9 = sc.nextLine();
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo:");
        pregunta10 = sc.nextLine();

        /** SUMANDO LAS RESPUESTAS VERDADERAS: **/
        for (int i = 0; i <= 10; i++) {
            if (pregunta1.equals(verdadero)) {
                i = contador + 3;
            }
            if (pregunta2.equals(verdadero)) {
                i = contador + 3;
            }
            if (pregunta3.equals(verdadero)) {
                i = contador + 3;
            }
            if (pregunta4.equals(verdadero)) {
                i = contador + 3;
            }
            if (pregunta5.equals(verdadero)) {
                i = contador + 3;
            }
            if (pregunta6.equals(verdadero)) {
                i = contador + 3;
            }
            if (pregunta7.equals(verdadero)) {
                i = contador + 3;
            }
            if (pregunta8.equals(verdadero)) {
                i = contador + 3;
            }
            if (pregunta9.equals(verdadero)) {
                i = contador + 3;
            }
            if (pregunta10.equals(verdadero)) {
                i = contador + 3;
            }
        }

        /** RESULTADOS: **/
        if (contador >= 0 && contador <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
        if (contador >= 11 && contador <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en s vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }
        if (contador >= 22 && contador <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabez");
        }
    }
}