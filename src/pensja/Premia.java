package pensja;

public class Premia extends DodatekStazowy {

    private double premia;

    public double getPremia() {
        return premia;
    }

    public Premia() {

    }

    public Premia(String imie, String nazwisko, float podstawa, float staz, int absencja, float dodatek, double premia) {
        super(imie, nazwisko, podstawa, staz, absencja, dodatek);
        this.premia = premia;
    }

    public void premia() {
        super.dodatek();
        if (getAbsencja() >= 10) {
            premia = 0;
        } else if (getAbsencja() > 0 && getAbsencja() < 10) {
            premia = (0.2) * getPodstawa() - getAbsencja() * 20;
        } else {
            premia = (0.2) * getPodstawa();
        }
        System.out.println("Premia:  - " + getPremia());
    }
}
