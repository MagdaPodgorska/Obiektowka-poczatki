package pensja;

public class Zasilek extends Wyplata {

    private double zasilek;
    private int miesiac;
    private double pomniejszenie;


    public double getZasilek() {
        return zasilek;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public double getPomniejszenie() {
        return pomniejszenie;
    }

    public Zasilek()
    {

    }
    public Zasilek(String imie, String nazwisko, float podstawa, float staz, int absencja, float dodatek,
                   double premia, double wyplata, double zasilek, int miesiac, int pomniejszenie) {
        super(imie, nazwisko, podstawa, staz, absencja, dodatek, premia, wyplata);
        this.zasilek = zasilek;
    }

    public void zasilek() {

        if (miesiac == 2) {
            zasilek = getAbsencja()*0.8 * (getWyplata()/ 28);
        } else if (miesiac == 4 || miesiac == 6 || miesiac == 9 || miesiac == 11) {
            zasilek = getAbsencja()*0.8 *( getWyplata()/ 30);
        } else {
            zasilek = getAbsencja()*0.8 * (getWyplata() / 31);
        }
    }

    public void zmniejsz() {
        if (miesiac == 2) {
            pomniejszenie = getAbsencja() * (getWyplata() / 28);
        } else if (miesiac == 4 || miesiac == 6 || miesiac == 9 || miesiac == 11) {
            pomniejszenie = getAbsencja() * (getWyplata() / 30);
        } else {
            pomniejszenie = getAbsencja() * (getWyplata()/ 31);
        }
    }
}
