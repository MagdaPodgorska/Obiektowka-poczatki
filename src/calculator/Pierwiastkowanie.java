package calculator;


public class Pierwiastkowanie extends Dodawanie {

    public Pierwiastkowanie(double a, double b) {
        super(a, b);
    }

    private double pot(double n, double i) {
        double potega = 1;
        for (double j = 1; j <= n; j++) {
            potega *= i;
        }
        return potega;
    }

    public void dzialanie() {

        try {
            double wynik = 0;
            for (double i = 1; i < getA() / 2; i++) {
                if (pot(getB(), i) == getA()) {
                    wynik = i;
                }
            }
            if (getB() == 0 && getA() == 0) {
                throw new ArithmeticException();
            }
            System.out.println(wynik);
        } catch (ArithmeticException e) {
            System.out.println("Wynik nieokreslony");
        }
    }
}
