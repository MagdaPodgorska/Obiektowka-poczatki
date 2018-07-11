package ciagi;

public class Fib implements Ciag {

    protected int numer;

    public int getNumer() {
        return numer;
    }

    public Fib() {

    }

    public Fib(int numer) {
        this.numer = numer;
    }

    private int fib(int numer) {
        int wynik;
        if (numer < 3) {
            wynik = 1;

        } else {
            wynik = fib(numer - 1) + fib(numer - 2);
        }

        return wynik;
    }

    private int sum(int numer) {
        int suma = 1;
        int[] tab = new int[numer];
        tab[0] = 1;
        tab[1] = 1;
        for (int i = 2; i < numer; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        for (int i = 0; i < numer; i++) {
            suma += tab[i];
        }
        return suma;
    }


    public void ciag() {
        System.out.println("Wyraz " + numer + " ciagu Fibonacciego wynosi " + fib(numer));
    }

    public void suma() {

        System.out.println("Suma pierwszych " + numer + " wyrazow ciagu Fibonacciego wynosi " + sum(numer));
    }

}
