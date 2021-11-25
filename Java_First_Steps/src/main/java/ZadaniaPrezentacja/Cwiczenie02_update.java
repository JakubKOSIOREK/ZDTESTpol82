package ZadaniaPrezentacja;

import java.util.Scanner;

public class Cwiczenie02_update {
    public static void main(String[] args) {

        /*
            W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program umożliwiający wyliczenie
            wysokości miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla programu są:
            -   cena towaru (od 100 zł do 10 tyś. zł),
            -   liczba rat (od 6 do 48).
            Kredyt jest oprocentowany w zależności od liczby rat:
            -   od  6 do 12 wynosi 2.5% ,
            -   od 13 do 24 wynosi 5%,
            -   od 25 do 48 wynosi 10%.
         */

        double cenaTowru;
        int liczbaRat;
        double oprocentowanie = 0;
        double kwotaRaty = 0;


            Scanner klawiatura = new Scanner(System.in);    // połączenie z klawiaturą

        /*
            Do podania danych wejściowych < cenaTowaru > i < liczbaRat > przy wartościach brzegowych,
            odpowiednio 100.00 zł<= cenaTowaru <= 10 000.00 zł oraz 6 <= liczbaRat <= 48
            stosujemy pętlę  < do{ } while( ); > instrukcją  < if ( ){ }; > w celu stworzenia czegoś
            na wzór ograniczenia wprowadzanych danych z klawiatury
         */


            // Podanie kwoty z przedziału od 100.00 zł do 10 000.00 zł

            do {
                System.out.println("Proszę podać cenę towaru :");
                cenaTowru = klawiatura.nextDouble();        // liczba podana z klawiatury

                if (cenaTowru < 100 || cenaTowru > 10000) {  /* sprawdzenie czy cenaTowaru jest z przedziału
                                                           od 100.00 zł do 10 000.00 zł, jeżeli nie to
                                                           wyświetli komunikat */

                    System.out.println("\nPodałaś / podałeś złą cenę\n");
                    System.out.println("Cena towaru musi zawierać się między 100.00 zł a 10 000.00 zł");
                }
            } while (cenaTowru < 100 || cenaTowru > 10000);  /* warunek powtórzenia pętli gdy cenaTowaru jest inna niż
                                                                  ta z przedziału od 100.00 zł do 10 000.00zł */

            // Podanie liczby rat z przedziału od 6 do 48

            do {
                System.out.println("Proszę podać ilość rat :");
                liczbaRat = klawiatura.nextInt();        // liczba podana z klawiatury

                if (liczbaRat < 6 || liczbaRat > 48) {   /* sprawdzenie czy liczbaRat jest z przedziału
                                                       od 6 do 48, jeżeli nie to wyświetli komunikat */

                    System.out.println("\nPodałaś / podałeś złą ilość rat\n");
                    System.out.println("Minimalna liczba rat to 6, maksymalna to 48");
                }
            } while (cenaTowru < 100 || cenaTowru > 10000);  /* warunek powtórzenia pętli gdy iloscRat jest inna niż
                                                           ta z przedziału od 6 do 48 */


            // Algorytm obliczania raty

            if (liczbaRat >= 6 && liczbaRat <= 12) {  // jeżeli liczbaRat jest więksa od / równa  6 i mniejsza od / równa 12 to
                oprocentowanie = 0.025;              // oprocentowanie = 2.5%
            }

            if (liczbaRat >= 13 && liczbaRat <= 24) { // jeżeli liczbaRat jest więksa od / równa 13 i mniejsza od / równa 24 to
                oprocentowanie = 0.05;               // oprocentowanie = 5%
            }

            if (liczbaRat >= 25 && liczbaRat <= 48) {  // jeżeli liczbaRat jest więksa od / równa 25 i mniejsza od / równa 48 to
                oprocentowanie = 0.1;                // oprocentowanie = 1%
            }

            kwotaRaty = (cenaTowru * oprocentowanie + cenaTowru / liczbaRat); // wyliczenie dokładnej kwoty jednej raty

            System.out.print("\nTwoja rzeczywista rata wynosi : ");
            System.out.print(kwotaRaty);
            System.out.println(" zł");

            //  zaokrąglamy kwotaRaty w do dwóch miejsc po przecinku

            kwotaRaty = Double.valueOf(kwotaRaty);
            kwotaRaty *= 100;
            kwotaRaty = Math.round(kwotaRaty);
            kwotaRaty /= 100;


            System.out.print("\nTwoja rata po zaokrągleniu wynosi : ");
            System.out.print(kwotaRaty);
            System.out.println(" zł");
    }
}
