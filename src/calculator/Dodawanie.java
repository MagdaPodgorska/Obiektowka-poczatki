package calculator;

import java.util.Scanner;

public class Dodawanie implements Dzialanie {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Dodawanie() {

    }

    public Dodawanie(double a, double b) {
        this.a = a;
        this.b = b;
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        this.a = scanner.nextDouble();
        this.b = scanner.nextDouble();
    }

    public void dzialanie() {

        System.out.println(getA() + getB());
    }
}
