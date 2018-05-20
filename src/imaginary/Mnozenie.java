package imaginary;

public class Mnozenie extends Liczba {

    private int iloczyn1;
    private int iloczyn2;

    void iloczyn(Liczba liczba1, Liczba liczba2) {
        iloczyn1 = (liczba1.getA() * liczba2.getA()) - (liczba1.getB() * liczba2.getB());
        iloczyn2 = liczba1.getA() * liczba2.getB() + liczba1.getB() + liczba2.getA();
        System.out.println("Iloczyn podanych liczb zespolonych wynosi: " + iloczyn1 + "+" + iloczyn2 + "i");
    }

    public int getIloczyn1() {
        return iloczyn1;
    }

    public int getIloczyn2() {
        return iloczyn2;
    }
}
