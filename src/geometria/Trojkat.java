package geometria;

public class Trojkat extends Odleglosc{

    private double obwod;

    public void obwod(Punkt punkt, Punkt punkt1, Punkt punkt2)
    {
        super.odleglosc(punkt,punkt1,punkt2);
        if( (((punkt.getWspolrzedna1()==punkt1.getWspolrzedna1())&&(punkt.getWspolrzedna1()==punkt2.getWspolrzedna1())))||
                ((punkt.getWspolrzedna2()==punkt1.getWspolrzedna2())&&(punkt.getWspolrzedna1()==punkt2.getWspolrzedna2())))
        {
            System.out.println("Punkty nie utworzą trojkata");
        }
        else
        {
            obwod=getOdleglosc()+getOdleglosc1()+getOdleglosc2();
        }
        System.out.println("Obwod trojkata "+punkt.getNazwa()+punkt1.getNazwa()+punkt2.getNazwa()+" wynosi "+obwod+" j");
    }

    public double getObwod() {
        return obwod;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.obwod==((Trojkat) obj).obwod)
        {

            if(super.equals(obj))
            {
                return  true;
            }
        }
        return false;
    }
}

