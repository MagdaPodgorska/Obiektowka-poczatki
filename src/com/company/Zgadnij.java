package com.company;

import java.util.Random;
import java.util.Scanner;

public class Zgadnij {

    int strzal;
    int licznik;
    Random generator = new Random();
    int liczba=generator.nextInt(101);

    void powitanie()
    {
        System.out.println("Zgadnij jako to liczba z zakresu 0-100");
    }

    void strzal()

    {

            while(strzal!=liczba)
            {
                licznik++;
                    Scanner odczyt = new Scanner(System.in);
                    strzal = Integer.valueOf(odczyt.nextLine());
                if(strzal<0||strzal>100)
                {
                    System.out.println("Podales liczbe spoza zakresu :)");
                }

                    else if(strzal<liczba)
                    {
                        System.out.println("To za mało");
                    }
                    else if(strzal>liczba)
                    {
                        System.out.println("To za duzo");
                    }
                    else
                    {
                        System.out.println("Brawo, trafiony w podejsciu nr "+licznik);
                    }

                }





    }


}
