package bryly;

public class Walec extends Kula {

    protected double wysokosc;


    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Walec(double promien, double wysokosc) {
        super(promien);
        this.wysokosc = wysokosc;
    }

    public void pole() {
        super.pole();
        pole = 2 * (getWysokosc() * promien) * Math.PI;
        System.out.print("Pole walca o promieniu " + promien + " i wysokosci " + getWysokosc() + " wynosi ");
        System.out.format("%.2f%n", pole);
    }

    public void objetosc() {
        super.objetosc();
        objetosc = (getWysokosc() * promien * promien) * Math.PI;
        System.out.print("Objetosc walca o promieniu " + promien + " i wysokosci " + getWysokosc() + " wynosi ");
        System.out.format("%.2f%n", objetosc);

    }
}
