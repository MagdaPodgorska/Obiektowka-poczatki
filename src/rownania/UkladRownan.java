package rownania;

public class UkladRownan {
    public static void main(String[] args) {

        Rownania rownanie1 = new Rownania(0, 0, 0);
        rownanie1.wzor();
        Rownania rownanie2 = new Rownania(0, 0, 0);
        rownanie2.wzor();
        Rozwiazanie rozwiazanie = new Rozwiazanie(0, 0, 0, 0, 0, 0, 0, 0);
        rozwiazanie.rozwiazanie(rownanie1, rownanie2);
    }


}
