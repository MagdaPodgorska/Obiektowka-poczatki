package rownania;

public class Wyznacznik extends Rownania {

    double W;
    double Wx;
    double Wy;

    public double getW() {
        return W;
    }

    public double getWx() {
        return Wx;
    }

    public double getWy() {
        return Wy;
    }

    public Wyznacznik() {

    }

    public Wyznacznik(double a1, double a2, double a3, double w, double wx, double wy) {
        super(a1, a2, a3);
        W = w;
        Wx = wx;
        Wy = wy;
    }

    public void wyznacznik(Rownania rownanie1, Rownania rownanie2) {

        W = rownanie1.getA1() * rownanie2.getA2() - rownanie1.getA2() * rownanie2.getA1();
        Wx = rownanie1.getA3() * rownanie2.getA2() - rownanie1.getA2() * rownanie2.getA3();
        Wy = rownanie1.getA1() * rownanie2.getA3() - rownanie1.getA3() * rownanie2.getA1();
        System.out.println("W=" + getW() + ", Wx=" + getWx() + ", Wy=" + getWy());
        if (W == 0 && Wx != 0 && Wy != 0) {
            System.out.println("Uklad sprzeczny");
        } else if (W == 0 && Wx == 0 && Wy == 0) {
            System.out.println("Uklad nieoznaczony");
        } else
            System.out.println("Uklad oznaczony");
    }
}
