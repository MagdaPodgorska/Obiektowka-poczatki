package bryly;

public class Prostopadloscian implements Objetosc, Pole {

    private double krawedz1;
    private double krawedz2;
    private double krawedz3;

    public double getKrawedz1() {
        return krawedz1;
    }

    public double getKrawedz2() {
        return krawedz2;
    }

    public double getKrawedz3() {
        return krawedz3;
    }

    public Prostopadloscian(double krawedz1, double krawedz2, double krawedz3) {
        this.krawedz1 = krawedz1;
        this.krawedz2 = krawedz2;
        this.krawedz3 = krawedz3;
    }

    public void pole() {
        if (getKrawedz1() == getKrawedz2() && getKrawedz2() == getKrawedz3()) {
            System.out.println();
            System.out.println("Pole szescianu o krawedzi " + getKrawedz1() + " jest rowne " +
                    (6 * getKrawedz1() * getKrawedz1()));
        } else {
            System.out.println();
            System.out.println("Pole prostopadloscianu o krawedziach " + getKrawedz1() + ", " + getKrawedz2() + ", "
                    + getKrawedz3() + " jest rowne " + (2 * (getKrawedz1() * getKrawedz1()) +
                    (getKrawedz1() * getKrawedz3()) + (getKrawedz2() * getKrawedz3())));
        }

    }

    public void objetosc() {
        if (getKrawedz1() == getKrawedz2() && getKrawedz2() == getKrawedz3()) {
            System.out.println("Objetosc szescianu o krawedzi " + getKrawedz1() + " jest rowna "
                    + (getKrawedz1() * getKrawedz1() * getKrawedz1()));
        } else {
            System.out.println("Objetosc prostopadloscianu o krawedziach " + getKrawedz1() + ", " + getKrawedz2() + ", "
                    + getKrawedz3() + " jest rowna " + (getKrawedz1() * getKrawedz2() * getKrawedz3()));
        }
    }
}
