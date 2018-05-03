package nowy_kalkulator;

import java.util.Scanner;

public class Kalkulator {

    private double liczba1;
    private double liczba2;
    private String znak;


   public Kalkulator ()
    {
        for(;;) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Liczba1: ");
            liczba1 = Integer.valueOf(scanner.nextLine());
            System.out.print("Liczba2: ");
            liczba2 = Integer.valueOf(scanner.nextLine());
            System.out.print("rodzaj dzialania +,-,*,/: ");
            znak = scanner.nextLine();
            if (znak.equals("+")) {
                System.out.println(liczba1 + liczba2);
            } else if (znak.equals("-")) {
                System.out.println(liczba1 - liczba2);
            } else if (znak.equals("*")) {
                System.out.println(liczba1 * liczba2);
            } else if (znak.equals("/") & liczba2 == 0) {
                System.out.println("Nie dziel przez zero");
            } else if (znak.equals("/") & liczba2 != 0) {
                System.out.println(liczba1 / liczba2);
            }
        }
    }





}
