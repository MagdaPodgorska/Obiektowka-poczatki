package show_event;

import java.util.Scanner;
import java.util.Date;


public class Data1 {
    private int day;
    private int month;
    private int year;
    private int cday;
    private int cmonth;
    private int cyear;
    Event name;
    private int obliczrok;
    private int obliczmiesiac;
    private int obliczdzien;
    Date date = new Date();

    public void sprawdzenie()
    {
        if (year-cyear<0)
        {
            System.out.println("Nieprawidlowy rok");
        }
        else if(year-cyear==0&&month-cmonth<0)
        {
            System.out.println("Nieprawidlowy miesiac");
        }
        else if (year-cyear==0&&month-cmonth==0&day-cday<0)
        {
            System.out.println("Nieprawidlowy dzien");
        }
    }
    public void obliczrok()
    {
        if (month - cmonth < 0)
            obliczrok = year - cyear - 1;
        else
            obliczrok = (year - cyear);
    }
    public void obliczmiesiac()
    {
        if(month-cmonth>=0)
        {
            if (day-cday >= 0)
                obliczmiesiac = (month - cmonth);
            else
                obliczmiesiac = (month - cmonth-1);
        }

        else
        if(day-cday >= 0)
            obliczmiesiac = ((12 - cmonth) + month);
        else
            obliczmiesiac = ((12 - cmonth) + month-1);
    }

    public void obliczdzien()
    {
        if (day - cday >= 0)
            obliczdzien = (day - cday);
        else

        {
            if (cmonth == 1 || cmonth == 3 || cmonth == 5 || cmonth == 7 || cmonth == 8 || cmonth == 10 || cmonth == 12)
                obliczdzien = ((31 - cday) + day);
            else if (cmonth == 2)
                obliczdzien = ((28 - cday) + day);
            else
                obliczdzien = ((30 - cday) + day);
        }
    }



    public Data1() {
        this.name = name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dzien wydarzenia: ");
        day = Integer.valueOf(scanner.nextLine());
        System.out.print("Podaj miesiac wydarzenia: ");
        month = Integer.valueOf(scanner.nextLine());
        System.out.print("Podaj rok wydarzenia: ");
        year = Integer.valueOf(scanner.nextLine());
        cday = date.getDate();
        cmonth = date.getMonth() + 1;
        cyear = date.getYear() + 1900;

        sprawdzenie();
        obliczrok();
        obliczmiesiac();
        obliczdzien();
    }

    public void ile() {
        System.out.println("Dzis mamy " + cday + " " + cmonth + " " + cyear);

        System.out.println("Do " + name.getNazwa() + " pozostalo lat - " + obliczrok+ " ,miesiecy- " + obliczmiesiac + " ,dni -" + obliczdzien);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


}



