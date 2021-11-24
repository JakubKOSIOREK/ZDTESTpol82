package Teoria;

import java.util.Scanner;

public class A07_KlasaScanner {
    public static void main(String[] args) {

        /*
        Klasa < Scanner klawiatura = new Scanner(System.in); >
        służy do wprowadzania danych do konsoli JAVA z klawiatury
         */

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę całkowitą : ");   // komunikat dotyczący wprowadzanej danej

        int danaZklawiatury = klawiatura.nextInt();                // zadeklarowana zmienna int -> WAŻNE metoda .next...
                                                                   // musi być zgodna z typem zmiennej, tu .nextInt()

        System.out.println("\nPodano liczbę : " + danaZklawiatury);
    }
}
