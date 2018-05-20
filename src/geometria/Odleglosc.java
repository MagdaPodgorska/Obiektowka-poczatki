package geometria;


public class Odleglosc extends Punkt{

    private double odleglosc;
    private double odleglosc1;
    private double odleglosc2;

    public double getOdleglosc() {
        return odleglosc;
    }
    public double getOdleglosc2() {
        return odleglosc2;
    }
    public double getOdleglosc1() {
        return odleglosc1;
    }

    public void odleglosc(Punkt punkt, Punkt punkt1,Punkt punkt2)
{
    odleglosc=Math.sqrt((punkt.getWspolrzedna1()-punkt1.getWspolrzedna1())*(punkt.getWspolrzedna1()-punkt1.getWspolrzedna1())
        +(punkt.getWspolrzedna2()-punkt1.getWspolrzedna2())*(punkt.getWspolrzedna2()-punkt1.getWspolrzedna2()));
    System.out.println("Odleglosc miedzy punktami "+punkt.getNazwa()+" i "+punkt1.getNazwa()+" wynosi "+odleglosc+" j");

    odleglosc1=Math.sqrt((punkt.getWspolrzedna1()-punkt2.getWspolrzedna1())*(punkt.getWspolrzedna1()-punkt2.getWspolrzedna1())
            +(punkt.getWspolrzedna2()-punkt2.getWspolrzedna2())*(punkt.getWspolrzedna2()-punkt2.getWspolrzedna2()));
    System.out.println("Odleglosc miedzy punktami "+punkt.getNazwa()+" i "+punkt2.getNazwa()+" wynosi "+odleglosc1+" j");

    odleglosc2=Math.sqrt((punkt1.getWspolrzedna1()-punkt2.getWspolrzedna1())*(punkt1.getWspolrzedna1()-punkt2.getWspolrzedna1())
            +(punkt1.getWspolrzedna2()-punkt2.getWspolrzedna2())*(punkt1.getWspolrzedna2()-punkt2.getWspolrzedna2()));
    System.out.println("Odleglosc miedzy punktami "+punkt1.getNazwa()+" i "+punkt2.getNazwa()+" wynosi "+odleglosc2+" j");
}

    @Override
    public boolean equals(Object obj) {
        if(this.odleglosc==((Odleglosc) obj).odleglosc&&this.odleglosc1==((Odleglosc) obj).odleglosc1&&this.odleglosc2==((Odleglosc) obj).odleglosc2)
        {
            if(super.equals(obj))
            {
                return true;
            }

        }
        return  false;
    }
}
