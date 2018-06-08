package pensja;

public class DodatekStazowy extends Pracownik {

    private double dodatek;

    public double getDodatek() {
        return dodatek;
    }

    public DodatekStazowy() {

    }

    public DodatekStazowy(String imie, String nazwisko, float podstawa, float staz, int absencja, float dodatek) {
        super(imie, nazwisko, podstawa, staz, absencja);
        this.dodatek = dodatek;
    }

    public void dodatek() {
        dodatek = (getStaz() * 0.01) * getPodstawa();
        System.out.println(getImie() + " " + getNazwisko());
        System.out.println("Dodatek stazowy: "  + "- " + getDodatek());


    }
}