package rownania;

import java.util.Scanner;

public class Rownania {

    private double a1;
    private double a2;
    private double a3;


    public double getA2() {
        return a2;
    }

    public double getA1() {
        return a1;

    }

    public double getA3() {
        return a3;
    }

    public Rownania() {

    }

    public Rownania(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;

    }

    public void wzor() {
        Scanner scanner = new Scanner(System.in);
        this.a1 = scanner.nextDouble();
        this.a2 = scanner.nextDouble();
        this.a3 = scanner.nextDouble();
        System.out.println(getA1() + "x +" + getA2() + "y =" + getA3());
    }
}
