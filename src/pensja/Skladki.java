package pensja;

public class Skladki extends Zasilek {

    private double skladki;
    private double zaliczka;

    public double getSkladki() {
        return skladki;
    }

    public double getZaliczka() {
        return zaliczka;
    }

    public Skladki(String imie, String nazwisko, float podstawa, float staz, int absencja, float dodatek, double premia,
                   double wyplata, double zasilek, int miesiac, int pomniejszenie, double skladki, double zaliczka) {
        super(imie, nazwisko, podstawa, staz, absencja, dodatek, premia, wyplata, zasilek, miesiac, pomniejszenie);
        this.skladki = skladki;
        this.zaliczka = zaliczka;
    }

    public void netto() {
        super.wyplata();
        super.zmniejsz();
        super.zasilek();
        skladki = 0.0976 * getWyplata() + 0.015 * getWyplata() + 0.0245 * getWyplata();
        zaliczka = 0.18 * getWyplata();
        System.out.print("Zasilek- ");
        System.out.format("%.2f%n",getZasilek());
        System.out.print("Przelew- " );
        System.out.format("%.2f%n",(getWyplata() - getSkladki() - getZaliczka()- getPomniejszenie()+getZasilek()));
    }
}
