package Velocity;

public class Fast { public static void main(String[] args) {

    Zawodnik zawodnik1=new Zawodnik();
    zawodnik1.wczytaj();
    zawodnik1.wypisz();

    Predkosc predkosc1= new Predkosc();
    predkosc1.uczestnik=zawodnik1;
    predkosc1.predkosc();
    predkosc1.wypisz1();

    Zawodnik zawodnik2=new Zawodnik();
    zawodnik2.wczytaj();
    zawodnik2.wypisz();

    Predkosc predkosc2= new Predkosc();
    predkosc2.uczestnik=zawodnik2;
    predkosc2.predkosc();
    predkosc2.wypisz1();



    if(predkosc1.predkosc()>predkosc2.predkosc())

        System.out.println("Zawodnik "+zawodnik1.imie+" "+zawodnik1.nazwisko+" jest szybszy");
    else if (predkosc1.predkosc()<predkosc2.predkosc())
        System.out.println("Zawodnik "+zawodnik2.imie+" "+zawodnik2.nazwisko+" jest szybszy");
    else
        System.out.println("Obaj zawodnicy są tak samo szybcy");

}
}
