package com.company;

public class ShowEventDate {
    public static void main(String[] args) {

        Data1 obiekt=new Data1();
        obiekt.takedate();
        obiekt.gaetdate();
        obiekt.obliczrok();
        obiekt.obliczmiesiac();
        obiekt.obliczdzien();

        Event zdarzenie=new Event();
        zdarzenie.coto();
        zdarzenie.dzien=obiekt;
        zdarzenie.miesiac=obiekt;
        zdarzenie.rok=obiekt;

        zdarzenie.show();
        obiekt.name=zdarzenie;


        obiekt.ile();


    }
}
