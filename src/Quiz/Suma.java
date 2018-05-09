package Quiz;

public class Suma {

    Quiz punkt;

    public void suma (Quiz pytanie1, Quiz pytanie2, Quiz pytanie3, Quiz pytanie4, Quiz pytanie5,Quiz pytanie6, Quiz pytanie7, Quiz pytanie8)
    {
        double suma=1;
        suma=pytanie1.punkty()+pytanie2.punkty()+pytanie3.punkty()+pytanie4.punkty()+pytanie5.punkty()+pytanie6.punkty()+pytanie7.punkty()+pytanie8.punkty();
        double procent=0;
        procent=suma/8;
        System.out.println();
        System.out.println("Zdobywasz "+suma+" pkt na 8, co stanowi "+procent*100+"% poprawnych odpowiedzi");

    }

}
