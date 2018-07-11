package ciagi;

public class Geometryczny extends Fib {

    private int pierwszyWyraz;
    private double iloczyn;

    public int getPierwszyWyraz() {
        return pierwszyWyraz;
    }

    public double getIloczyn() {
        return iloczyn;
    }

    public Geometryczny(int numer, int pierwszyWyraz, double iloczyn) {
        super(numer);
        this.pierwszyWyraz = pierwszyWyraz;
        this.iloczyn = iloczyn;
    }

    private double geometryczny(int pierwszyWyraz, int numer, double iloczyn) {
        double wynik;
        if (numer == 1) {
            wynik = pierwszyWyraz;
        } else {
            wynik = geometryczny(pierwszyWyraz, numer - 1, iloczyn) * iloczyn;
        }

        return wynik;
    }

    private double sum(int pierwszyWyraz, int numer, double iloczyn) {
        double suma = 1;
        for (int i = 1; i <= numer; i++) {
            suma  = pierwszyWyraz * ((1 - Math.pow(iloczyn, i)) / (1 - iloczyn));

        }
        return suma;
    }

    public void ciag() {
        System.out.println("Wyraz " + numer + " ciagu  geometrycznego wynosi " + geometryczny(pierwszyWyraz, numer, iloczyn));
    }

    public void suma() {
        System.out.println("Suma pierwszych " + numer + " wyrazow ciagu geometrycznego wynosi " + sum(pierwszyWyraz, numer, iloczyn));
    }

}
