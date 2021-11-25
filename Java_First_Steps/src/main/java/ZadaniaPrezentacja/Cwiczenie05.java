package ZadaniaPrezentacja;

public class Cwiczenie05 {
    public static void main(String[] args) {

        /*
        Napisać program, który:
            • utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z przedziału [−10, . . . , 10],
            • wypisze na ekranie zawartość
            • wyznaczy najmniejszy oraz najwięszy element w tablicy,
            • wyznaczy średnią arytmetyczną elementów tablicy.
         */

        int[] tablica = new int[10];        // tworzymy zmienną tablica o długości 10
        int minimum, maximum;               // zmienne globalne

        // PROGRAM GŁÓWNY

        for (int komorkaTablicy = 0; komorkaTablicy < tablica.length; komorkaTablicy++){
            // tu warunek pętli for(), tablica.length -> metoda zwracająca automatycznie długość tablicy

            tablica[komorkaTablicy] = (int) ( Math.random() * 20 - 10 );
            /* instrukcja wypełnienia komórek tablicy losowymi liczbami z przedziału od -10 do 10
            (int) oznacza rzutowanie/konwersję metody Math.random() z double na int
             < * 20 - 10 > zwiększa wartości metody .random() i określa przedział */
        }

        minimum = tablica[0]; // wartość początkowa minimum pobrana z komórk 0 tablicy
        maximum = tablica[0]; // wartość początkowa maximum pobrana z komórk 0 tablicy

        // ODPOWIEDŹ PROGRAMU

        System.out.println("\nWartości w tablicy to : ");

        for (int komorkaTablicy = 0; komorkaTablicy < tablica.length; komorkaTablicy++){
            // tu warunek pętli for(), musi być taki sam jak przy wpisywaniu danych do tabeli

            System.out.print(tablica[komorkaTablicy] + ", "); // wypisuje wszystkie 10 wartości z komórek 0-9 tablicy

            if (tablica[komorkaTablicy] < minimum){   // jeżeli wartość komórki jest miniejsza od wartości minimum to
                minimum = tablica[komorkaTablicy];    // zapisz jako nowe minimum
            }                                         // jeżeli nie to zakończ

            if (tablica[komorkaTablicy] > maximum){  // jeżeli wartość komórki jest większa od wartości maximum to
                maximum = tablica[komorkaTablicy];   // zapisz jako nowe maximum
            }                                        // jeżeli nie to zakończ
        }
        System.out.println("\n\nwarotść minimalna w tablicy to : " + minimum);
        System.out.println("wartość maxymalna w tablicy to : " + maximum);
    }

}
