package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

       // Prosty kalkulator z uzyciem polimorficznego interfejsu + obsluga wyjatkow

        Dzialanie dzialanie = new Dodawanie(0, 0);
        dzialanie.dzialanie();

        dzialanie = new Odejmowanie(0, 0);
        dzialanie.dzialanie();

        dzialanie = new Mnozenie(0, 0);
        dzialanie.dzialanie();

        dzialanie = new Dzielenie(1, 1);
        dzialanie.dzialanie();

        dzialanie = new Potegowanie(2, 2);
        dzialanie.dzialanie();

        dzialanie = new Pierwiastkowanie(1, 1);
        dzialanie.dzialanie();

    }
}

