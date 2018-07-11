package calculator;

public class Odejmowanie extends Dodawanie {
    public Odejmowanie(double a, double b) {
        super(a, b);
    }


    public void dzialanie() {

        System.out.println(getA() - getB());
    }
}
