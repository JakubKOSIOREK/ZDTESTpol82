package ZadaniaSDA;

import java.util.Scanner;

public class SDAzadanie12_petla_for {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        int liczbaCalkowitaWprowadzona;
        int liczbaCalkowita;

        // Ask user for a positive integer number
        System.out.println("Podaj liczbę: ");
        liczbaCalkowitaWprowadzona = userInput.nextInt();


        for (int i = 1; i <= liczbaCalkowitaWprowadzona; i++) {
            liczbaCalkowita = i % 2;

            if (liczbaCalkowita > 0) {
                System.out.println("Liczba nieparzysta: " + i);
            }
        }
    }
}