package ZadaniaSDA;

import java.util.Scanner;

public class SDAzadanie04 {
    public static void main(String[] args) {
    /*
    Napisz program, który pobierze od użytkownika liczbę całkowitą i wypisze ją na ekran.
    Na ekranie powinien wyświetlać się następujący komunikat "Użytkownik wprowadził X",
    gdzie X jest liczbą podaną przez użytkownika.
    Zakładamy sytuację, w której użytkownik, nie będzie wprowadzał innych typów danych niż liczby całkowite.

    Do obsługi wprowadzania danych przez użytkownika zastosuj bibliotekę Scanner.
    Wykonaj testy, sprawdź jak program, zachowuje się dla innych typów danych.
 */



        Scanner klawiatura = new Scanner (System.in);
        System.out.println("Podaj dowolną liczbę całkowitą X :");
        int x = klawiatura.nextInt();


        System.out.println("\nUżytkownik wprowadził : " + x);

    }
}
