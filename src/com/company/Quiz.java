package com.company;

import java.util.Scanner;

public class Quiz {
    String tresc;
    int odpowiedz;
    int poprawna_odpowiedz;


void powitanie()
{
    System.out.println("QUIZ FIZYKA - CIEKAWOSTKI");
    System.out.println("Witaj, do każdego pytania jest możliwa jedna poprawna odpowiedź. Powodzenia.");
}

    void tresc()
    {
        System.out.println(tresc);
    }

    void wybor()
    {
        while(odpowiedz!=1&odpowiedz!=2)
            {

                System.out.print("Podaj  odpowiedz: ");
                Scanner scanner = new Scanner(System.in);
                odpowiedz = Integer.valueOf(scanner.nextLine());
                if(odpowiedz!=1&odpowiedz!=2)
                {
                    System.out.println("Zly wybor, wpisz jeszcze raz");
                }
            }

    }

    void sprawdz()
    {
        if(odpowiedz==poprawna_odpowiedz)
        {
            System.out.println("Poprawna odpowiedz, zdobywasz punkt :)");

        }
        else
            System.out.println("Niepoprawna odpowiedz :( punktow nie zdobywasz");
    }

    int punkty()
    {
        if(odpowiedz==poprawna_odpowiedz)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}


