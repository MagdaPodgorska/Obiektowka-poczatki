package imaginary;

public class Sprzezenie extends Liczba {


    public Sprzezenie(int a, int b)
    {
        super(a,b);
        System.out.println("liczba sprzezona do liczby "+getA()+"+"+getB()+"i to liczba "+getA()+"-"+getB()+"i");
    }

}
