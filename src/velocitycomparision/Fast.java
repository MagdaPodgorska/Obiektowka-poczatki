package velocitycomparision;

public class Fast { public static void main(String[] args) {

    Zawodnik zawodnik1=new Zawodnik();
    Predkosc predkosc1= new Predkosc(zawodnik1);
    Zawodnik zawodnik2=new Zawodnik();
    Predkosc predkosc2= new Predkosc(zawodnik2);
    VelocityComparision comapare=new VelocityComparision();
    comapare.compare(predkosc1,predkosc2,zawodnik1,zawodnik2);








}
}
