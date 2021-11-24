package ZadaniaPrezentacja;

import java.util.Scanner;

public class Cwiczenie01 {
    public static void main(String[] args) {
    /*
    Napisać program służący do konwersji wartości temperatury podanej w stopniach Celsjusza
    na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0).
    */

        char znakStopnia = 176; // znak stopnia z tablicy UNICODE
        double stopnieCelsjusza;
        double Fahrenheit;

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wartość temperatury w " + znakStopnia + "C : ");
        stopnieCelsjusza = klawiatura.nextDouble();
        System.out.println("\nWprowadzona temperatura = " + stopnieCelsjusza + " " + znakStopnia + "C\n");

        Fahrenheit = 1.8 * stopnieCelsjusza + 32.0;

        System.out.println(stopnieCelsjusza + " " + znakStopnia + "C = " + Fahrenheit + " F");
    }
}
