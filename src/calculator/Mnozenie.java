package calculator;

public class Mnozenie extends Dodawanie {

    public Mnozenie(double a, double b) {
        super(a, b);
    }


    public void dzialanie() {

        System.out.println(getA() * getB());
    }
}
