package bryly;

public class Bryly {

    public static void main(String[] args) {

        // Obliczanie objetosci i pola bryl za pomoca polimorficznych interfejsow

        Pole pole = new Kula(2);
        pole.pole();
        Objetosc objetosc = new Kula(2);
        objetosc.objetosc();

        pole = new Walec(1, 1);
        pole.pole();
        objetosc = new Walec(1, 1);
        objetosc.objetosc();

        pole = new Stozek(3, 2, 2);
        pole.pole();
        objetosc = new Stozek(1, 2, 1);
        objetosc.objetosc();

        pole = new Prostopadloscian(3, 2.5, 3);
        pole.pole();
        objetosc = new Prostopadloscian(0.5, 3, 3);
        objetosc.objetosc();
    }
}
