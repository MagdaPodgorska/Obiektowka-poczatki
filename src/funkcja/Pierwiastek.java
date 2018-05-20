package funkcja;

public class Pierwiastek extends Delta {

    private double pierwiastek1;
    private double pierwiastek2;

    Pierwiastek(double a, double b, double c) {
        super(a, b, c);

    }

    public void pierwiastek() {
        super.licz();
        if (getDelta() < 0) {
            System.out.println("Funkcja nie ma pierwiastkow rzeczywistych.");
        } else if (getDelta() == 0) {
            pierwiastek1 = pierwiastek2;
            pierwiastek1 = (-getB()) / (2 * getA());
            System.out.println("Funkcja ma jeden pierwiastek: x0=" + pierwiastek1);
        } else {
            pierwiastek1 = (-getB() - getPierwiastek()) / (2 * getA());
            pierwiastek2 = (-getB() + getPierwiastek()) / (2 * getA());
            System.out.println("Funkcja ma dwa pierwiastki: x1=" + pierwiastek1 + ", x2=" + pierwiastek2);
        }
    }

    public double getPierwiastek1() {
        return pierwiastek1;
    }

    public double getPierwiastek2() {
        return pierwiastek2;
    }

    @Override
    public boolean equals(Object obj) {

        if (this.pierwiastek1 == ((Pierwiastek) obj).pierwiastek1 && this.pierwiastek2 == ((Pierwiastek) obj).pierwiastek2) {

            if(super.equals(obj))
            {
                return true;
            }
        }
        return false;
    }
}
