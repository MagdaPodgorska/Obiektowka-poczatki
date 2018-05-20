package funkcja;

import geometria.Punkt;

import java.util.Scanner;

public class Funkcja {

    private double a;
    private double b;
    private double c;

    public Funkcja() {

    }

    public Funkcja(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void wpisz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wspolczynnik a:");
        this.a = scanner.nextDouble();
        System.out.println("Podaj wspolczynnik b:");
        this.b = scanner.nextDouble();
        System.out.println("Podaj wspolczynnik c:");
        this.c = scanner.nextDouble();
    }

    void wzor() {
        System.out.println("Funkcja ma postac: y= " + this.a + "x^2 + " + this.b + "x+" + this.c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    @Override
    public boolean equals(Object obj) {

        if (this.a==((Funkcja) obj).a&&this.b==((Funkcja) obj).b&&this.c==((Funkcja) obj).c)
        {
            return true;
        }
        return false;
    }
}
