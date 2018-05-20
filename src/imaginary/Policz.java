package imaginary;

public class Policz {
    public static void main(String[] args)
    {
        Liczba liczba1=new Liczba(0,0);
        liczba1.postac();
        Liczba liczba2=new Liczba(0,0);
        liczba2.postac();
        Dodawanie suma=new Dodawanie();
        suma.dodawanie(liczba1,liczba2);
        Mnozenie iloczyn=new Mnozenie();
        iloczyn.iloczyn(liczba1,liczba2);
        Sprzezenie sprzezenie=new Sprzezenie(0,0);
    }
}
