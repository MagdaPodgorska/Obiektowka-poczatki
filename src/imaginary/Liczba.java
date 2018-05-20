package imaginary;

import java.util.Scanner;

public class Liczba {

    private int a;
    private  int b;

   public Liczba()
    {

    }

    public Liczba(int a, int b)
    {
        this.a=a;
        this.b=b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Podaj wspolczynnik rzeczywisty: ");
        this.a=scanner.nextInt();
        System.out.print("Podaj wspolczynnik urojony: ");
        this.b=scanner.nextInt();
    }

    public void postac()
    {
        System.out.println("Liczba zespolona ma postac: "+a+"+"+b+"i");
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
