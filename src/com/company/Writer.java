package com.company;

import java.util.Scanner;

public class Writer {
    String name;
    String surname;

    void writer()
    {
Scanner odczyt=new Scanner(System.in);
        System.out.print("Imie autora: ");
name=odczyt.nextLine();
        System.out.print("Nazwisko autora: ");
surname=odczyt.nextLine();


    }
}

