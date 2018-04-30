package book;

import java.util.Scanner;

public class Bookstore {
    String name;
    Book book;
    int price;

    void name()
    {
        Scanner odczyt=new Scanner(System.in);
        System.out.print("Nazwa ksiegarni: ");
        name=odczyt.nextLine();
        System.out.print("Cena: ");
        price=Integer.valueOf(odczyt.nextLine());

        System.out.println("W ksiegarni "+name+" ksiazka autora "+ book.writer.name+" "+book.writer.surname+" pod tytulem "+book.name
                +" kosztuje "+price+" monet.");
    }




}




