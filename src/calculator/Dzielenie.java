package calculator;

public class Dzielenie extends Dodawanie {
    public Dzielenie(double a, double b) {
        super(a, b);
    }


    public void dzialanie() {

        try {
            if (getB() == 0) {
                throw new ArithmeticException();
            }
            System.out.println(getA() / getB());
        } catch (ArithmeticException e) {
            System.out.println("Nie dzielimy przez zero");
        }
    }
}

