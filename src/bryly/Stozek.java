package bryly;

public class Stozek extends Walec {

    protected double tworzaca;

    public double getTworzaca() {
        return tworzaca;
    }

    public void setTworzaca(double tworzaca) {
        this.tworzaca = tworzaca;
    }

    public Stozek(double promien, double wysokosc, double tworzaca) {
        super(promien, wysokosc);
        this.tworzaca = tworzaca;
    }

    public void pole() {
        super.pole();
        pole = (getTworzaca() * promien) * Math.PI;
        System.out.print("Pole stozka o promieniu " + promien + " i tworzacej " + getTworzaca() + " wynosi ");
        System.out.format("%.2f%n", pole);

    }

    public void objetosc() {
        super.objetosc();
        objetosc = ((wysokosc * promien * promien) * Math.PI) / 3;
        System.out.print("Objetosc stozka o promieniu " + promien + " i wysokosci " + wysokosc + " wynosi ");
        System.out.format("%.2f%n", objetosc);

    }
}
