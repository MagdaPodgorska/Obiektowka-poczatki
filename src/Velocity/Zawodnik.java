package Velocity;

import java.util.Scanner;

public class Zawodnik {

    String imie;
    String nazwisko;
    double czas;
    double dystans;

    void wczytaj()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj dane zawodnika:");
        System.out.print("Imie: ");
        imie=scanner.nextLine();
        System.out.print("Nazwisko: ");
        nazwisko=scanner.nextLine();
        System.out.print("czas: ");
        czas=Double.valueOf(scanner.nextLine());
        System.out.print("dystans: ");
        dystans=Integer.valueOf(scanner.nextLine());
    }



    void wypisz ()
    {
        System.out.println(imie+" "+nazwisko+" "+czas+" s "+dystans+" m");
    }

}
