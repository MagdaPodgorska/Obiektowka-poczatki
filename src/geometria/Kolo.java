package geometria;

import java.util.Scanner;

public class Kolo extends Punkt {

    private double promien;
    private double poleKola;

    public Kolo(String nazwa, double wspolrzedna1, double wspolrzedna2, double promien) {
        super(nazwa, wspolrzedna1, wspolrzedna2);
        this.promien = promien;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc promienia: ");
        this.promien = scanner.nextDouble();
        poleKola = Math.PI * this.promien * this.promien;
        System.out.println("Pole kola o srodku w punkcie " + getNazwa() + " (" + getWspolrzedna1() + "," + getWspolrzedna2() + ")" +
                " i  promieniu " + this.promien + " wynosi " + poleKola);
    }

    public double getPoleKola() {
        return poleKola;
    }
    public boolean equals(Object obj) {
        if (this.promien == ((Kolo) obj).promien && this.poleKola == ((Kolo) obj).poleKola) {
            if (super.equals(obj)) {
                return true;
            }

        }
        return false;
    }
}


