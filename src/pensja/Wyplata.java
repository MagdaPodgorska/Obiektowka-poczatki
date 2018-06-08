package pensja;

public class Wyplata extends Premia {

    private double wyplata;

    public double getWyplata() {
        return wyplata;
    }

    public Wyplata() {

    }

    public Wyplata(String imie, String nazwisko, float podstawa, float staz, int absencja, float dodatek, double premia, double wyplata) {
        super(imie, nazwisko, podstawa, staz, absencja, dodatek, premia);
        this.wyplata = wyplata;
    }

    public void wyplata() {
        super.premia();
        this.wyplata = getPodstawa() + getDodatek() + getPremia();
        System.out.println("Do wyplaty brutto- " + getWyplata());
    }
}
