package ciagi;

public class Arytmetyczny extends Fib {

    private int pierwszyWyraz;
    private int roznica;


    public int getPierwszyWyraz() {
        return pierwszyWyraz;
    }

    public int getRoznica() {
        return roznica;
    }

    public Arytmetyczny(int numer, int pierwszyWyraz, int roznica) {
        super(numer);
        this.pierwszyWyraz = pierwszyWyraz;
        this.roznica = roznica;
    }

    private int arytmetyczny(int pierwszyWyraz, int numer, int roznica) {
        int wynik;
        if (numer == 1) {
            wynik = pierwszyWyraz;
        } else {
            wynik = arytmetyczny(pierwszyWyraz, numer - 1, roznica) + roznica;
        }

        return wynik;
    }

    private int sum(int pierwszyWyraz, int numer, int roznica) {
        int suma = 0;
        for (int i = 1; i <= numer; i++) {
            suma = ((pierwszyWyraz + arytmetyczny(pierwszyWyraz, numer, roznica)) * i) / 2;
        }
        return suma;
    }

    public void ciag() {
        System.out.println("Wyraz " + numer + " ciagu  arytmetycznego wynosi " + arytmetyczny(pierwszyWyraz, numer, roznica));
    }

    public void suma() {
        System.out.println("Suma pierwszych " + numer + " wyrazow ciagu arytmetycznego wynosi " + sum(pierwszyWyraz, numer, roznica));
    }

}
