package show_event;

import java.util.Scanner;

public class Event {

    private String nazwa;
    private Data1 dzien;
    private Data1 miesiac;
    private Data1 rok;

   public Event(Data1 dzien,Data1 miesiac, Data1 rok)
    {
        this.dzien=dzien;
        this.miesiac=miesiac;
        this.rok=rok;
        System.out.println("Co to za wydarzenie?");
        Scanner scanner = new Scanner(System.in);
        nazwa=scanner.nextLine();
        System.out.println(nazwa+" odbedzie sie "+ dzien.getDay()+" "+miesiac.getMonth()+" "+rok.getYear());

    }

    public String getNazwa() {
        return nazwa;
    }
}
