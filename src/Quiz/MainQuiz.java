package Quiz;

import static java.lang.Thread.sleep;

public class MainQuiz {
    public static void main(String[] args) throws InterruptedException {

        Quiz start=new Quiz();

        Tresc tresc1=new Tresc();
        Odpowiedzi odpowiedz1=new Odpowiedzi();
        Quiz pytanie1 = new Quiz(tresc1.getTresc1(),odpowiedz1.getPoprawna_odpowiedz1());
        pytanie1.punkty();

        Tresc tresc2=new Tresc();
        Odpowiedzi odpowiedz2=new Odpowiedzi();
        Quiz pytanie2= new Quiz(tresc2.getTresc2(),odpowiedz2.getPoprawna_odpowiedz2());
        pytanie2.punkty();

        Tresc tresc3=new Tresc();
        Odpowiedzi odpowiedz3=new Odpowiedzi();
        Quiz pytanie3= new Quiz(tresc3.getTresc3(),odpowiedz3.getPoprawna_odpowiedz3());
        pytanie3.punkty();

        Tresc tresc4=new Tresc();
        Odpowiedzi odpowiedz4=new Odpowiedzi();
        Quiz pytanie4= new Quiz(tresc4.getTresc4(),odpowiedz4.getPoprawna_odpowiedz4());
        pytanie4.punkty();

        Tresc tresc5=new Tresc();
        Odpowiedzi odpowiedz5=new Odpowiedzi();
        Quiz pytanie5= new Quiz(tresc5.getTresc5(),odpowiedz5.getPoprawna_odpowiedz5());
        pytanie5.punkty();

        Tresc tresc6=new Tresc();
        Odpowiedzi odpowiedz6=new Odpowiedzi();
        Quiz pytanie6= new Quiz(tresc6.getTresc6(),odpowiedz6.getPoprawna_odpowiedz6());
        pytanie6.punkty();

        Tresc tresc7=new Tresc();
        Odpowiedzi odpowiedz7=new Odpowiedzi();
        Quiz pytanie7= new Quiz(tresc7.getTresc7(),odpowiedz7.getPoprawna_odpowiedz7());
        pytanie7.punkty();

        Tresc tresc8=new Tresc();
        Odpowiedzi odpowiedz8=new Odpowiedzi();
        Quiz pytanie8= new Quiz(tresc8.getTresc8(),odpowiedz8.getPoprawna_odpowiedz8());
        pytanie8.punkty();

        Suma suma=new Suma();
        suma.suma(pytanie1,pytanie2,pytanie3,pytanie4,pytanie5,pytanie6,pytanie7,pytanie8);

    }
}
