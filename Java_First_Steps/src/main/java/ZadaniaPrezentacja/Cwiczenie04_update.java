package ZadaniaPrezentacja;

import java.util.Scanner;

public class Cwiczenie04_update {
    public static void main(String[] args) {

        /*
        Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*). Użytkownik programu
        powinien podać liczbę całkowitą n, n > 0, określającą wysokość choinki (liczbę wierszy).
        Przykład: dla n = 5 wynik powinien wyglądać następująco:
                            *
                           ***
                          *****
                         *******
                        *********
         */

        String znakChoinki = "*";       // zmienna typu String -> znak gwiazdki
        int wysokoscChoinki;            // zmienna określająca wysokość choinki

        Scanner klawiatura = new Scanner(System.in);

        /*
        Do wprowadzenia wysokości choinki użyjemy pętli < do{} while(); > aby mieć pewność, że użytkownik podał
        prawidłową wartość oraz instrukcji  < if(){} >  wewnątrz pętli aby określić minimalną wysokość choinki
         */

        do {    // START
            System.out.println("Podaj wysokość choinki :");
            wysokoscChoinki = klawiatura.nextInt();         // wprowadzoną wartość z klawiatury zapisz do zmiennej

            // jeżeli wysokość choinki jest mniejsza od 2 to
            if (wysokoscChoinki <= 1) System.out.println("Wysokość choinki musi być większa lub równa 2.");
        } while(wysokoscChoinki <=1);                       // powtórz pętlę gdy wysokość choinki jest mniejsza od 2,
        // jeżeli nie to idź dalej


        // TU SIĘ TWORZY CHOINKA -> MACIERZ[w][k]

        int[][] choinka = new int[wysokoscChoinki][wysokoscChoinki + 2];

        for (int w = 0; w < wysokoscChoinki; w++)
            for (int k = 0; k < wysokoscChoinki + 2; k++){
                choinka[w][k] = 1;
            }

        // TU SIĘ WYŚWIETLA CHOINKA

        for (int w = 0; w < wysokoscChoinki; w++){
            for (int k = 0; k < 2 * wysokoscChoinki; k++){
                if (k < (wysokoscChoinki - w) || k > (wysokoscChoinki + w)){
                    System.out.print(" ");
                } else {
                    System.out.print(znakChoinki);
                }
            }
            System.out.println();
        }
    }
}
