package rownania;


public class Rozwiazanie extends Wyznacznik {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Rozwiazanie(double a1, double a2, double a3, double w, double wx, double wy, double x, double y) {
        super(a1, a2, a3, w, wx, wy);
        this.x = x;
        this.y = y;
    }

    public void rozwiazanie(Rownania rownanie1, Rownania rownanie2) {
        super.wyznacznik(rownanie1, rownanie2);
        if (getW() == 0) {
            System.out.println();
        } else {
            x = getWx() / getW();
            y = getWy() / getW();
            System.out.println("x=" + x + ", y=" + y);
        }
    }
}
