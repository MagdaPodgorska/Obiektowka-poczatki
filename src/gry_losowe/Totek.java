package gry_losowe;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Totek {

    int tab[]=new int[6];

    void wstep()
    {
        System.out.println(" DUŻY LOTEK. Losowanie sześciu liczb z zakresu 1-49");

    }

    Random generator = new Random();

    void losuj() {

        for (int i = 0; i < 6; i++)
        {

            tab[i] = (generator.nextInt(49))+1;

        }
    }

    void sort()
    {
        for (int i=0; i<6;i++)
        {
            for (int j=5;j>=1;j--)
            {
                if(tab[j]<tab[j-1])
                {
                    int a=tab[j-1];
                    tab[j-1]=tab[j];
                    tab[j]=a;
                }

            }
        }
    }

    void wypisz () throws InterruptedException {
        for (int i = 0; i < 6; i++)
        {
sleep(1000);
            System.out.print(" " + tab[i]);


        }
    }
}



