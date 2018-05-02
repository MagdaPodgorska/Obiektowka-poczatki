package velocitycomparision;

public class VelocityComparision {

    public void compare (Predkosc predkosc1, Predkosc predkosc2, Zawodnik zawodnik1, Zawodnik zawodnik2 )
    {

        if(predkosc1.getPredkosc()>predkosc2.getPredkosc())
            System.out.println("Zawodnik "+zawodnik1.getImie()+" "+zawodnik1.getNazwisko()+" jest szybszy");
        else if (predkosc1.getPredkosc()<predkosc2.getPredkosc())
            System.out.println("Zawodnik "+zawodnik2.getImie()+" "+zawodnik2.getNazwisko()+" jest szybszy");
        else
            System.out.println("Obaj zawodnicy są tak samo szybcy");
    }


}
