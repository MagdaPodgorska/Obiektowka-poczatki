package Quiz;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Quiz {

   private int odpowiedz;
    private int poprawna_odpowiedz;
    private String tresc;


    public Quiz () throws InterruptedException {
        System.out.println("QUIZ FIZYKA CIEKAWOSTKI");
        System.out.println("Do każdego pytania możliwa jest tylko jedna poprawna odpowiedz.");
        sleep(2000);
    }

   public Quiz ( String tresc, int poprawna_odpowiedz) throws InterruptedException {
            sleep(2000);
            this.tresc=tresc;
            System.out.println(tresc);
            this.poprawna_odpowiedz=poprawna_odpowiedz;
        while(odpowiedz!=1&odpowiedz!=2)
        {
            System.out.print("Podaj  odpowiedz: ");
            Scanner scanner = new Scanner(System.in);
            odpowiedz = Integer.valueOf(scanner.nextLine());
            if(odpowiedz!=1&odpowiedz!=2)
            {
                System.out.println("Zly wybor, wpisz jeszcze raz");
            }
        }
            if(odpowiedz==poprawna_odpowiedz)
            {
                System.out.println("Poprawna odpowiedz, zdobywasz punkt :)");

            }
            else
                System.out.println("Niepoprawna odpowiedz :( punktow nie zdobywasz");


    }

    public int punkty()
    {
        if(odpowiedz==poprawna_odpowiedz)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}




