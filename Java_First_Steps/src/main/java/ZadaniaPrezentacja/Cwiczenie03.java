package ZadaniaPrezentacja;

import java.util.Scanner;

public class Cwiczenie03 {
    public static void main(String[] args) {

        /*
        Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie wyświetla na
        ekranie kolejno wszystkie liczby niepatrzyste nie większe od podanej liczby.

        Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.
         */

        int liczbaCalkowitaWprowadzona;
        int liczbaCalkowitaDodatnia = 1;

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("\nPodaj dowolną dodatnią liczbę całkowitą :");
        liczbaCalkowitaWprowadzona = klawiatura.nextInt();

        System.out.println("\nDla podanej liczby wszystkie niepażyste liczby całkowite, nie większe od podanej liczby to :");
        while (liczbaCalkowitaDodatnia <= liczbaCalkowitaWprowadzona){
            if (liczbaCalkowitaDodatnia % 2 == 1){
                System.out.print(liczbaCalkowitaDodatnia + ", ");
            }
            liczbaCalkowitaDodatnia++;
        }
        System.out.println();

    }
}
