package ZadaniaSDA;

import java.util.Scanner;

public class SDAzadanie06 {
    public static void main(String[] args) {

        /*
        Napisz program, który pobiera hasło od użytkownika, najpierw jednak wypisze na ekran słowa "Poproszę hasło".
        Pobrane hasło powinno zostać wypisane na ekran. Jeśli hasło zgadza się z hasłem wzorcowym "secret",
        to na ekran powinien zostać wypisany tekst "Witaj w tajnym miejscu",
        w przeciwnym przypadku zakończ działanie programu.
        */

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Poproszę hasło ");
        String password = klawiatura.nextLine();


        System.out.println("Podane hasło to " + password);      // wyświetla wprowadzone hasło

        // SPRAWDZENIE HASŁA

        if (password.equals("secret")) {                // metoda equals() pozwala na porównanie zmiennych z wzorcem

            System.out.println("Witaj w tajnym miejscu.");
        }






    }
}
