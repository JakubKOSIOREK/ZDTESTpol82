package ZadaniaSDA;

import java.util.Scanner;

public class SDAzadanie05 {
    public static void main(String[] args) {
        /*
        Napisz program, który pobiera dwie liczby całkowite, a następnie wykonuje następujące operacje matematyczne:
        - dodawanie
        - odejmowanie
        - mnożenie
        - dzielenie
        - podniesienie do potęgi
            (pierwszy argument to liczba, która będzie podnoszona do potęgi,
            drugi argument to potęga, do której podnosimy liczbę)

        Wynik operacji powinien zostać przypisany do nowo utworzonej zmiennej, odpowiedniego typu.

        Wynik powinien zostać wyświetlony na ekranie, w następującej postaci:
        - dodawanie -> "a = A, b = B, wynik to C"
        - odejmowanie -> "a = A, b = B, wynik to C"
        - mnożenie -> "a = A, b = B, wynik to C"
        - dzielenie -> "a = A, b = B, wynik to C"
        - podniesienie do potęgi -> "a = A, podniesione do potęgi B, daje wynik C"
         */

        Scanner klawiatura = new Scanner(System.in);

        //Podanie pierwszej wartości a
        System.out.println("Podaj pierwszą liczbę całkowitą a :");
        int a = klawiatura.nextInt();

        //Podanie drugiej wartości b
        System.out.println("Podaj drugą liczbę całkowitą b :");
        int b = klawiatura.nextInt();

        // wyniki działań najlepiej podać jako liczby zmiennoprzecinkowe typu double//

        // dodawanie
        double wynik_sumy = a + b;
        System.out.println("a = " + a + ", b = " + b + ", wynik a + b = " + wynik_sumy);

        // odejmowanie
        double wynik_roznicy = a - b;
        System.out.println("a = " + a + ", b = " + b + ", wynik a - b = " + wynik_roznicy);

        // mnożenie
        double iloczyn = a * b;
        System.out.println("a = " + a + ", b = " + b + ", wynik a * b = " + iloczyn);

        // dzielenie
        double iloraz = a / b;
        System.out.println("a = " + a + ", b = " + b + ", wynik a / b = " + iloraz);

        // potęgowanie
        double wynik_potegowania = Math.pow(a, b);       // tu stosujemy klasę matematyczną Math z metodą .pow()
        System.out.println("a = " + a + ", b = " + b + ", wynik a + b = " + wynik_potegowania);


    }
}
