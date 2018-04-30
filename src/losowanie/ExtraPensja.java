package losowanie;

import java.util.Random;

import static java.lang.Thread.sleep;

public class ExtraPensja {

    int tab[]=new int[5];
    int tab1[]=new int [4];

    void wstep()
    {
        System.out.println();
        System.out.println(" EXTRA PENSJA. Losowanie pieciu liczb z zakresu 1-35 a następnie jednej liczby  z zakresu 1-4");

    }

    Random generator = new Random();

    void losuj()
    {
        for (int i = 0; i < 5; i++)
        {

            tab[i] = (generator.nextInt(35))+1;

        }
    }

    void sort()
    {
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
    }

    void wypisz () throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            sleep(1000);
            System.out.print(" " + tab[i]);


        }
    }

    void dodatkowy()
    {
        System.out.println();
        System.out.println("LOSOWANIE DODATKOWEJ LICZBY");
    }

    void losuj1()
    {

        for (int i = 0; i < 1; i++)
        {

                tab[i] = (generator.nextInt(4))+1;

        }
    }
    void wypisz1() throws InterruptedException {

        for (int i = 0; i < 1; i++)
        {

            System.out.print(" Dodatkową liczbą jest " + tab[i]);


        }
    }


}
