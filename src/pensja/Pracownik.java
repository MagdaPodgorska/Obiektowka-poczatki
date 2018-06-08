package pensja;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private float podstawa;
    private float staz;
    private int absencja;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public float getPodstawa() {
        return podstawa;
    }

    public float getStaz() {
        return staz;
    }

    public int getAbsencja() {
        return absencja;
    }

    public Pracownik() {

    }

    public Pracownik(String imie, String nazwisko, float podstawa, float staz, int absencja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.podstawa = podstawa;
        this.staz = staz;
        this.absencja = absencja;
    }


}
