package bryly;

public class Kula implements Pole, Objetosc {

    protected double promien;
    protected double pole;
    protected double objetosc;

    public double getPromien() {
        return promien;
    }


    public double getPole() {
        return pole;
    }


    public double getObjetosc() {
        return objetosc;
    }

    public Kula(double promien) {
        this.promien = promien;
    }

    public void pole() {
        pole = (4 * getPromien() * getPromien()) * Math.PI;
        System.out.println();
        System.out.print("Pole kuli o promieniu " + getPromien() + " wynosi ");
        System.out.format("%.2f%n", pole);

    }

    public void objetosc() {
        objetosc = (4 / 3) * (getPromien() * getPromien() * getPromien()) * Math.PI;
        System.out.print("Objetosc kuli o promieniu " + getPromien() + " wynosi ");
        System.out.format("%.2f%n", objetosc);

    }

}
