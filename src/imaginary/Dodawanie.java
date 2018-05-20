package imaginary;

public class Dodawanie extends Liczba{

    private int suma1;
    private int suma2;

    public void dodawanie(Liczba liczba1, Liczba liczba2)
    {
        suma1=liczba1.getA()+liczba2.getA();
        suma2=liczba1.getB()+liczba2.getB();
        System.out.println("Suma podanych liczb zespolonych wynosi: "+suma1+"+"+suma2+"i");
    }

    public int getSuma1() {
        return suma1;
    }
    public int getSuma2() {
        return suma2;
    }
}
