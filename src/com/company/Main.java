package com.company;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Quiz powitanie=new Quiz();
        powitanie.powitanie();

        sleep(2000);

        Quiz pytanie1= new Quiz();
        System.out.println("Pytanie 1 ");
        pytanie1.tresc="Kto odkrył, ze Ksiezyc nieustannie spada na Ziemie?: " +
                "1. Neewton, 2. Galileusz";
        pytanie1.poprawna_odpowiedz=1;
        pytanie1.tresc();
        pytanie1.wybor();
        pytanie1.sprawdz();
        pytanie1.punkty();


        sleep(2000);

        System.out.println("Pytanie 2 ");
        Quiz pytanie2= new Quiz();
        pytanie2.tresc="Na Jowiszu czas płynie: " +
                "1. wolniej niz na Ziemi, 2. szybciej niz na Ziemi";
        pytanie2.poprawna_odpowiedz=1;
        pytanie2.tresc();
        pytanie2.wybor();
        pytanie2.sprawdz();
        pytanie2.punkty();

        sleep(2000);

        System.out.println("Pytanie 3 ");
        Quiz pytanie3= new Quiz();
        pytanie3.tresc="Ktore prawo fizyki kwantowej powoduje, że nie mozemy przechodzic przez sciany?: " +
                "1.Zasada nieoznacoznosci Heisenberga, 2. Zakaz Pauliego";
        pytanie3.poprawna_odpowiedz=2;
        pytanie3.tresc();
        pytanie3.wybor();
        pytanie3.sprawdz();
        pytanie3.punkty();

        sleep(2000);

        System.out.println("Pytanie 4 ");
        Quiz pytanie4= new Quiz();
        pytanie4.tresc="Co decyduje o tym, ze latwiej wymieszac mleko z kawa, niz oddzielic mleko od kawy?: " +
                "1. malejaca Entropia 2. wzrastajaca Entropia";
        pytanie4.poprawna_odpowiedz=2;
        pytanie4.tresc();
        pytanie4.wybor();
        pytanie4.sprawdz();
        pytanie4.punkty();

        sleep(2000);

        System.out.println("Pytanie 5 ");
        Quiz pytanie5= new Quiz();
        pytanie5.tresc="Czy to prawda, ze oddychajac mozemy wciagnac do pluc atom azotu, ktory byl kiedys w plucach Tyranozaura? " +
                "1. tak, 2. nie ";
        pytanie5.poprawna_odpowiedz=1;
        pytanie5.tresc();
        pytanie5.wybor();
        pytanie5.sprawdz();
        pytanie5.punkty();

        sleep(2000);

        System.out.println("Pytanie 6 ");
        Quiz pytanie6= new Quiz();
        pytanie6.tresc="Czy to prawda, ze elektron moze przbywac w dwoch miejscach jednoczesnie? " +
                "1. tak, 2. nie ";
        pytanie6.poprawna_odpowiedz=1;
        pytanie6.tresc();
        pytanie6.wybor();
        pytanie6.sprawdz();
        pytanie6.punkty();

        sleep(2000);

        System.out.println("Pytanie 7 ");
        Quiz pytanie7= new Quiz();
        pytanie7.tresc="Jaki fakt powoduje, że wygladajac przez okno  mozemy jednoczesnie widziec w szybie nasze odbicie? ? " +
                "1. swiatlo to fala , 2. swiatlo to jednoczesnie strumien fotonow i fala  ";
        pytanie7.poprawna_odpowiedz=2;
        pytanie7.tresc();
        pytanie7.wybor();
        pytanie7.sprawdz();

        sleep(2000);

        System.out.println("Pytanie 8 ");
        Quiz pytanie8= new Quiz();
        pytanie8.tresc="Skad sie wzielo na Ziemi zloto? 1. powstalo w wybuchu lokalnej Supernowej, " +
                "2. powstalo w Wielkim Wybuchu ";
        pytanie8.poprawna_odpowiedz=1;
        pytanie8.tresc();
        pytanie8.wybor();
        pytanie8.sprawdz();
        pytanie8.punkty();

        sleep(2000);

        double suma=1;
        suma=pytanie1.punkty()+pytanie2.punkty()+pytanie3.punkty()+pytanie4.punkty()+pytanie5.punkty()+pytanie6.punkty()+pytanie7.punkty()+pytanie8.punkty();
        double procent=0;
        procent=suma/8;
        System.out.println();
        System.out.println("Zdobywasz "+suma+" pkt na 8, co stanowi "+procent*100+"% poprawnych odpowiedzi");





















 //       Czlowiek obiekt= new Czlowiek();
   //     obiekt.wzrost=1.75f;

    //    Sklep obiektSklep = new Sklep();
    //    obiektSklep.autko = new Auto();
      //  obiektSklep.autko.wlasciciel = new Czlowiek();
     //   obiektSklep.autko.wlasciciel.wzrost=2.5f;



    }
}
