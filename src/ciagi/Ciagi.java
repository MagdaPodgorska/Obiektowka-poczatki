package ciagi;

public class Ciagi {
    public static void main(String[] args) {

        // Obliczanie sumy i zadanego wyrazu roznych ciagow za  pomoca polimorficznego interfejsu

        Ciag ciag = new Fib(10);
        ciag.ciag();
        ciag.suma();

        ciag = new Arytmetyczny(3, 5, 2);
        ciag.ciag();
        ciag.suma();

        ciag = new Geometryczny(3, 1, 0.5);
        ciag.ciag();
        ciag.suma();

        ciag = new Odwrotnosc(30);
        ciag.ciag();
        ciag.suma();
    }
}
