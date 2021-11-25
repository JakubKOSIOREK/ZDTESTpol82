package ZadaniaPrezentacja;

import java.util.Scanner;

public class Cwiczenie04 {
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

            if (wysokoscChoinki <= 1){                      // jeżeli wysokość choinki jest mniejsza od 2 to
                System.out.println("Wysokość choinki musi być większa lub równa 2.");
            }
        } while(wysokoscChoinki <=1);                       // powtórz pętlę gdy wysokość choinki jest mniejsza od 2,
                                                            // jeżeli nie to idź dalej

        // TU SIĘ TWORZY CHOINKA -> MACIERZ[X][Y]

        for (int x = 0; x <= wysokoscChoinki; x++){
            for (int y = 0; y < wysokoscChoinki; y++){
                if ( y < (wysokoscChoinki-x) || y > (wysokoscChoinki + x)){
                    System.out.print(" ");
                }else{
                    System.out.print(znakChoinki + " ");
                }
            }
            System.out.println();
        }
    }
}
