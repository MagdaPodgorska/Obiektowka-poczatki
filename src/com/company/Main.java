package com.company;

public class Main {

    public static void main(String[] args) {
	Kalkulator obiekt= new Kalkulator();

	//obiekt.liczba1=5;
	//obiekt.liczba2=10;
        obiekt.wczytajliczby();


        System.out.println(obiekt.dodawanie());
        System.out.println(obiekt.odejmowanie());
        System.out.println(obiekt.dzielenie());

    }
}
