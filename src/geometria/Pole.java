package geometria;

public class Pole extends Trojkat{

    private double pole;

    public void pole(Punkt punkt, Punkt punkt1, Punkt punkt2)
    {
        super.obwod(punkt,punkt1,punkt2);
        pole=Math.sqrt((getObwod())*(getObwod()-getOdleglosc())*(getObwod()-getOdleglosc1())*(getObwod()-getOdleglosc2()));
        System.out.println("Pole trojkata "+punkt.getNazwa()+punkt1.getNazwa()+punkt2.getNazwa()+" wyniosi "+pole+" j^2");
    }

    public double getPole() {
        return pole;
    }

    public boolean equals(Object obj) {
        if (this.pole == ((Pole) obj).pole) {

            if (super.equals(obj)) {
                return true;
            }
        }
        return false;
    }

}
