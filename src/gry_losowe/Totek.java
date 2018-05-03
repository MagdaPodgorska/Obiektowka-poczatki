package gry_losowe;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Totek
 {
     private int tab[]=new int[6];
    Totek () throws InterruptedException {
        System.out.println(" DUŻY LOTEK. Losowanie sześciu liczb z zakresu 1-49");

        Random generator = new Random();
        for (int i = 0; i < 6; i++)
        {
            tab[i] = (generator.nextInt(49)) + 1;
        }
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
        for (int i = 0; i < 6; i++)
        {
            sleep(1000);
            System.out.print(" " + tab[i]);


        }

        sleep(1000);
    }
    }










