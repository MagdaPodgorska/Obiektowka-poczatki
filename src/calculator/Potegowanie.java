package calculator;

public class Potegowanie extends Dodawanie {

    public Potegowanie(double a, double b) {
        super(a, b);
    }


    private double potega(double a, double b) {
        double wynik;
        if (b == 0) {
            wynik = 1;
        } else {
            wynik = a * (potega(a, (b - 1)));
        }
        return wynik;
    }

    public void dzialanie() {
        try {

            if (getB() == 0 && getA() == 0) {
                throw new ArithmeticException();
            }
            System.out.println(potega(getA(), getB()));
        } catch (ArithmeticException e) {
            System.out.println("Wynik nieokreslony");
        }
    }
}
