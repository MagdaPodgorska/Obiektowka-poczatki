package velocitycomparision;

public class Predkosc {
   private Zawodnik uczestnik;
   private double predkosc;



    public Predkosc(Zawodnik uczestnik)
    {
        this.uczestnik=uczestnik;
if(uczestnik.getCzas()==0||uczestnik.getDystans()==0)
{
    System.out.println("Wartosci nie moga byc zerowe");
}

    else
{
    predkosc = uczestnik.getDystans() / uczestnik.getCzas();
    System.out.println("Predkosc uczestnika "+uczestnik.getImie()+" "+uczestnik.getNazwisko()+" wyniosla "+predkosc+" m/s");
}


    }


    public double getPredkosc() {
        return predkosc;
    }

    public Zawodnik getUczestnik()
    {
        return uczestnik;
    }
}

