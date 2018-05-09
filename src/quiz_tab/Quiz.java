package quiz_tab;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Quiz {

    private String tresc[]= {"Kto odkrył, ze Ksiezyc nieustannie spada na Ziemie?: " +
            "1. Neewton, 2. Galileusz","Na Jowiszu czas płynie: " +
            "1. wolniej niz na Ziemi, 2. szybciej niz na Ziemi","Ktore prawo fizyki kwantowej powoduje, że nie mozemy przechodzic przez sciany?: " +
            "1.Zasada nieoznacoznosci Heisenberga, 2. Zakaz Pauliego", "Co decyduje o tym, ze latwiej wymieszac mleko z kawa, niz oddzielic mleko od kawy?: " +
            "1. malejaca Entropia 2. wzrastajaca Entropia",  "Czy to prawda, ze oddychajac mozemy wciagnac do pluc atom azotu, ktory byl kiedys w plucach Tyranozaura? " +
            "1. tak, 2. nie ", "Czy to prawda, ze elektron moze przbywac w dwoch miejscach jednoczesnie? " +
            "1. tak, 2. nie ", "Jaki fakt powoduje, że wygladajac przez okno  mozemy jednoczesnie widziec w szybie nasze odbicie? ? " +
            "1. swiatlo to fala , 2. swiatlo to jednoczesnie strumien fotonow i fala  ","Skad sie wzielo na Ziemi zloto? 1. powstalo w wybuchu lokalnej Supernowej, " +
            "2. powstalo w Wielkim Wybuchu "};
    private int poprawna_odpowiedz[]={1,1,2,2,1,1,2,1};
    private int odpowiedz[]=new int[8];
    private double licznik;

    public String[] getTresc() {
        return tresc;
    }

    public int[] getPoprawna_odpowiedz() {
        return poprawna_odpowiedz;
    }

    public int[] getOdpowiedz() {
        return odpowiedz;
    }

    public Quiz () throws InterruptedException {
    for (int i=0;i<tresc.length;i++)
    {
        sleep(2000);
        System.out.println(getTresc()[i]);
        while(getOdpowiedz()[i]!=1&getOdpowiedz()[i]!=2)
        {
            System.out.print("Podaj  odpowiedz: ");
            Scanner scanner = new Scanner(System.in);
            getOdpowiedz()[i] = Integer.valueOf(scanner.nextLine());
            if(getOdpowiedz()[i]!=1&getOdpowiedz()[i]!=2)
            {
                System.out.println("Zly wybor, wpisz jeszcze raz");
            }
        }
        if(getOdpowiedz()[i]==getPoprawna_odpowiedz()[i])
        {
            System.out.println("Poprawna odpowiedz, zdobywasz punkt :)");

        }
        else
            System.out.println("Niepoprawna odpowiedz :( punktow nie zdobywasz");

        if(getOdpowiedz()[i]==getPoprawna_odpowiedz()[i])
        {
           licznik++;
        }

    }
        double procent=0;
        procent=licznik/8;
        System.out.println();
        System.out.println("Zdobywasz "+licznik+"  punktow na 8, co stanowi " + procent * 100 + "% poprawnych odpowiedzi");
}





}



