package com.company;

import java.util.Scanner;

public class Event {

    String nazwa;
    Data1 dzien;
    Data1 miesiac;
    Data1 rok;

    void coto()
    {
        System.out.println("Co to za wydarzenie?");
        Scanner scanner = new Scanner(System.in);
        nazwa=scanner.nextLine();

    }

    void show()
    {
        System.out.println(nazwa+" odbedzie sie "+ dzien.day+" "+miesiac.month+" "+rok.year);
    }



}
