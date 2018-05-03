package gry_losowe;

import java.util.Random;

import static java.lang.Thread.sleep;

public class ExtraPensja {

    private int tab[]=new int[5];
    private int tab1[]=new int [4];


    public ExtraPensja() throws InterruptedException {
        System.out.println();
        System.out.println(" EXTRA PENSJA. Losowanie pieciu liczb z zakresu 1-35 a następnie jednej liczby  z zakresu 1-4");
        Random generator = new Random();

        for (int i = 0; i < 5; i++)
        {

            tab[i] = (generator.nextInt(35))+1;

        }
        for (int i=0; i<5;i++)
        {
            for (int j=4;j>=1;j--)
            {
                if(tab[j]<tab[j-1])
                {
                    int a=tab[j-1];
                    tab[j-1]=tab[j];
                    tab[j]=a;
                }

            }
        }
        for (int i = 0; i < 5; i++)
        {
            sleep(1000);
            System.out.print(" " + tab[i]);
        }
        sleep(1000);
            System.out.println();
            System.out.println("LOSOWANIE DODATKOWEJ LICZBY");
        for (int i = 0; i < 1; i++)
        {

            tab[i] = (generator.nextInt(4))+1;

        }
        for (int i = 0; i < 1; i++)
        {

            System.out.print(" Dodatkową liczbą jest " + tab[i]);


        }
    }
}
