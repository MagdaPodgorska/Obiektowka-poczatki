package losowanie;

import static java.lang.Thread.sleep;

public class GryLosowe {
    public static void main(String[] args) throws InterruptedException {

        Totek start=new Totek();
        start.wstep();

        sleep(2000);

        Totek losowanie=new Totek();
        losowanie.losuj();
        losowanie.sort();
        losowanie.wypisz();

        sleep(2000);

        ExtraPensja start1=new ExtraPensja();
        start1.wstep();

        sleep(2000);

        ExtraPensja losowanie1=new ExtraPensja();
        losowanie1.losuj();
        losowanie1.sort();
        losowanie1.wypisz();
        sleep(2000);
        losowanie1.dodatkowy();
        losowanie1.losuj1();
        sleep(2000);
        losowanie1.wypisz1();


    }
}
