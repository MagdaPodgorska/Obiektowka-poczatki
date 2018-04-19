package com.company;

import java.util.Scanner;

public class Kalkulator {

    int liczba1;
    int liczba2;

    int dodawanie()
    {
        return liczba1+liczba2;
    }
    int odejmowanie()
    {
        return liczba1-liczba2;
    }

    int dzielenie()
    {

        if(liczba2==0)
        {

            System.out.println("Stop");
            return 0;
        }
        return liczba1/liczba2;
    }

    void wczytajliczby()
    {
        Scanner scanner=new Scanner(System.in);
       liczba1=Integer.valueOf(scanner.nextLine());
       liczba2=Integer.valueOf(scanner.nextLine());


    }


}
