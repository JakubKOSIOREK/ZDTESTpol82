package ZadaniaSDA;

import java.util.Scanner;

public class SDAzadanie07 {
    public static void main(String[] args) {

        /*
        Napisz program, który pobiera imie od użytkownika, najpierw jednak wypisze na ekran słowa "Podaj swoje imie".
        Imię powinno zostać wydrukowane na ekran. Jeśli podane imię zgadza się z "John Wick", to na ekran program
        powinien wypisać "Widzę, że znów pracujesz John", w przeciwnym przypadku program powinien wydrukować na ekran
        "Witaj, [xyz]", gdzie [xyz], powinno zostać zastąpione wartością podaną przez użytkownika.
        */

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj swoje imie ");
        String imie = klawiatura.nextLine();
        System.out.println("Twoje imie to " + imie);

        if (imie.equals("John Wick")){                              // equals() porównuje zmienną imie ze wzorcem
            System.out.println("Widzę, że znów pracujesz John");
        } else {
            System.out.println("Witaj," + imie);
        }
    }

}
