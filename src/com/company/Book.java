package com.company;

import java.util.Scanner;

public class Book {
    String name;

    Writer writer;

    void book()
    {
        Scanner odczyt=new Scanner(System.in);
        System.out.print("Tytul: ");
        name=odczyt.nextLine();


    }

}
