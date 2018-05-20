package geometria;

import java.util.Scanner;

public class Prostokat {
    private int a;
    private int b;
    private float r;
    private double pole;

    public   Prostokat (int a, int b)
    {
        this.a=a;
        this.b=b;

        Scanner scanner=new Scanner(System.in);
        this.a=scanner.nextInt();
        this.b=scanner.nextInt();

        pole=this.a*this.b;
        System.out.println("Pole prostokata: "+pole);
    }

    public Prostokat(int r)
    {
    this.r=r;
    Scanner scanner=new Scanner(System.in);
    this.r=scanner.nextInt();
    pole=(Math.PI)* this.r*this.r;
    System.out.println("Pole kola: "+pole);
    }
}
