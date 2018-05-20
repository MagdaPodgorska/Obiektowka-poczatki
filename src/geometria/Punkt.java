package geometria;

import java.util.Scanner;

public class Punkt {
    private String nazwa;
    private double wspolrzedna1;
    private double wspolrzedna2;

    public String getNazwa() {
        return nazwa;
    }
    public double getWspolrzedna1() {
        return wspolrzedna1;
    }
    public double getWspolrzedna2() {
        return wspolrzedna2;
    }

    public Punkt()
    {

    }

    public Punkt (String nazwa, double wspolrzedna1,double wspolrzedna2)
    {
        this. nazwa=nazwa;
        this.wspolrzedna1=wspolrzedna1;
        this.wspolrzedna2=wspolrzedna2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj nazwe punktu ");
        this.nazwa=scanner.next();
        System.out.println("Podaj wspolrzedna punktu na osi X ");
        this.wspolrzedna1=Integer.valueOf(scanner.next());
        System.out.println("Podaj wspolrzedna punktu na osi Y ");
        this.wspolrzedna2=Integer.valueOf(scanner.next());
        System.out.println("Punkt "+this.nazwa+" ma wspolrzedne ("+this.wspolrzedna1+","+this.wspolrzedna2+")");
    }

    @Override
    public boolean equals(Object obj) {
        if(!this.nazwa.equals(((Punkt) obj).nazwa))
        {
            return false;
        }
        if (this.wspolrzedna1!=((Punkt) obj).wspolrzedna1||this.wspolrzedna2!=((Punkt) obj).wspolrzedna2)
        {
            return false;
        }
        return true;
    }
}
