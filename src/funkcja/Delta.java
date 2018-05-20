package funkcja;

public class Delta extends Funkcja {

    private double delta;
    private double pierwiastek;

    public Delta(double a, double b, double c) {
        super(a, b, c);
    }

    public void licz() {
        super.wpisz();
        super.wzor();
        delta = getB() * getB() - 4 * getA() * getC();
        System.out.println("Delta= " + delta);
        pierwiastek = Math.sqrt(delta);
    }

    public double getPierwiastek() {
        return pierwiastek;
    }

    public double getDelta() {
        return delta;
    }

    @Override
    public boolean equals(Object obj) {

        if (this.delta == ((Delta) obj).delta && this.pierwiastek == ((Delta) obj).pierwiastek) {

            if(super.equals(obj))
            {
                return true;
            }
        }
        return false;
    }
}
