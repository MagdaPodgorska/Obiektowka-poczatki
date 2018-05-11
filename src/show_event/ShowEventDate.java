package show_event;

public class ShowEventDate {
    public static void main(String[] args) {

        Data1 obiekt=new Data1();
        Event zdarzenie=new Event(obiekt, obiekt,obiekt);
        obiekt.name=zdarzenie;
        obiekt.ile();
    }
}
