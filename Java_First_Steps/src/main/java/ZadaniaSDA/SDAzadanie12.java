package ZadaniaSDA;

import java.util.Scanner;

public class SDAzadanie12 {
    public static void main(String[] args) {

        /*
        Napisz program, który pobierze od użytkownika, dodatnią liczbę całkowitą,
        a następnie wypisze wszystkie liczby nieparzyste, nie większe od tej liczby.
         */

        int liczbaCalkowitaWprowadzona;
        int liczbaCalkowitaDodatnia = 1;

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("\nPodaj dowolną dodatnią liczbę całkowitą :");
        liczbaCalkowitaWprowadzona = klawiatura.nextInt();

        while (liczbaCalkowitaDodatnia <= liczbaCalkowitaWprowadzona) {
            if (liczbaCalkowitaDodatnia % 2 == 1) {
                System.out.println("Liczba całkowita niepażysta:" + liczbaCalkowitaDodatnia);
            }
            liczbaCalkowitaDodatnia++;
        }
    }
}