package velocitycomparision;

import java.util.Scanner;

public class Zawodnik {

   private String imie;
   private String nazwisko;
    private double czas;
   private double dystans;

    public Zawodnik() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane zawodnika:");
        System.out.print("Imie: ");
        imie = scanner.nextLine();
        System.out.print("Nazwisko: ");
        nazwisko = scanner.nextLine();
        System.out.print("czas: ");
        czas = Double.valueOf(scanner.nextLine());
        System.out.print("dystans: ");
        dystans = Integer.valueOf(scanner.nextLine());
        System.out.println(imie + " " + nazwisko + " " + czas + " s " + dystans + " m");
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getCzas() {
        return czas;
    }

    public double getDystans() {
        return dystans;
    }
}


