package com.sergiobejaranoarroyo.Ejercicio7_2__Libro;

public class Calendario {
    private int year, month, day;

    public Calendario(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void incrementarDias(int cantdad) {
        if (this.day + cantdad <= 30) {
            this.day += cantdad;
        } else {
            this.month++;
            this.day = cantdad - 30;

            if (this.month == 13) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void incrementarMeses(int numMeses) {
        this.month += numMeses;

        if (this.month > 12) {
            this.year++;
            this.month -= 12;
        }
    }

    public void incrementarYear(int numYears) {
        this.year += numYears;
    }

    public boolean iguales(Calendario c) {
        return (this.month == c.month && this.day == c.day && this.year == c.year);
    }
}