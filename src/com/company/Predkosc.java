package com.company;

public class Predkosc {
    Zawodnik uczestnik;
    double predkosc;



    double predkosc()
    {

            if(uczestnik.czas==0) {
                System.out.println("Chyba nie sadzisz, ze zawodnik odkryl tunel czasporzestrzenny?");
                return 0;
            }

            else if(uczestnik.dystans==0) {

                System.out.println("Coz, tak stac w miejcu na zawodach sie nie godzi");
                return 0;
            }
        predkosc = uczestnik.dystans / uczestnik.czas;
        return predkosc;



    }

    void wypisz1()
    {
        System.out.println("Predkosc uczestnika "+uczestnik.imie+" "+uczestnik.nazwisko+" wyniosla "+predkosc+" m/s");
    }


}
