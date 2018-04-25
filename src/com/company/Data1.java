package com.company;

import java.util.Scanner;
import java.util.Date;

public class Data1{
        int day;
        int month;
        int year;
        int cday;
        int cmonth;
        int cyear;
        Event name;


        Date date=new Date();
        void takedate()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj dzien wydarzenia ");
            day=Integer.valueOf(scanner.nextLine());
            System.out.println("Podaj miesiac wydarzenia ");
            month=Integer.valueOf(scanner.nextLine());
            System.out.println("Podaj rok wydarzenia ");
            year=Integer.valueOf(scanner.nextLine());
        }

        void gaetdate()
        {
            cday=date.getDate();
            cmonth=date.getMonth()+1;
            cyear=date.getYear()+1900;

        }

        int obliczrok ()
        {
            if (month-cmonth<=0)
                return (year-cyear-1);
            else
                return (year-cyear);

        }
        int obliczmiesiac()
        {
            if(month-cmonth>=0)
                return (month-cmonth-1);
            else
                return ((12-cmonth)+month-1);
        }
        int obliczdzien()
        {
            if(day-cday>=0)
            return (day-cday);
            else
            {
                if(cmonth==1||cmonth==3||cmonth==5||cmonth==7||cmonth==8||cmonth==10||cmonth==12)
                    return ((31-cday)+day);
                else if(cmonth==2)
                    return ((28-cday)+day);
                else
                    return ((30-cday)+day);
            }
        }

        void ile()
        {
            System.out.println("Do "+name.nazwa+" pozostalo lat - "+obliczrok()+" ,miesiecy- "+obliczmiesiac()+" ,dni -"+obliczdzien());
        }
}
