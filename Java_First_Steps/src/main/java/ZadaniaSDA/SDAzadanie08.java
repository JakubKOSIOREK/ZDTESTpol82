package ZadaniaSDA;

import java.util.Scanner;

public class SDAzadanie08 {
    public static void main(String[] args) {

    /*
    Napisz program, który dokona konwersji temperatury wprowadzonej przez użytkownika:

    -   ze skali Celsjusza na skalę Fahrenheit'a (stopnie w F = 1.8 * stopnie w C + 32)
    -   ze skali Fahrenheit'a na skalę Celsjusza (stopnie w C = (stopnie w F - 32 / 1.8))
    -   ze skali Celsjusza na skalę Kelvin'a (stopnie w K = stopnie w C + 273.15)
    -   ze skali Kelvin'a na skalę Celsjusza (stopnie w C = stopnie w K - 273.15)
    -   ze skali Kelvin'a na skalę Fahrenheit'a (stopnie w F = (stopnie w K - 273.15) * 1.8 + 32)
    -   ze skali Fahrenheit'a na skalę Kelvin'a (stopnie w K = ((stopnie w F - 32/1.8) + 273.15)

    Każdą z operacji konwersji temperatury, napisz w osobnej metodzie, którą następnie wywołasz w metodzie main.
    */

        Scanner readTemperature = new Scanner(System.in);
        System.out.println("Podaj temperaturę ");
        double temp = readTemperature.nextDouble();
        System.out.println();

        // METODY -> tu wypisujemy metody do których będziemy się odwoływać

        CelsjuszeNaFahrenheity(temp);
        FahrenheityNaCelsjusze(temp);
        CtoK(temp);
        KtoC(temp);
        KtoF(temp);
        FtoK(temp);

    }

    // Celsius to Fahrenheit
    private static void CelsjuszeNaFahrenheity(double temp) {       // metoda private
        double tempCtoF;
        char znakStopnia = 176;
        tempCtoF = 1.8 * temp + 32;
        System.out.println(temp + " " + znakStopnia + "C to " + tempCtoF + " F");
    }

    // Fahrenheit to Celsius
    private static void FahrenheityNaCelsjusze(double temp) {
        double tempFtoC;
        char znakStopnia = 176;
        tempFtoC = (32 - temp) / 1.8;

        System.out.println(temp + "  F to " + tempFtoC + " " + znakStopnia + "C");
    }

    // Celsius to Kelvin
    private static void CtoK(double temp) {
        double tempCtoK;
        char znakStopnia = 176;
        tempCtoK = temp + 273.15;
        System.out.println(temp + " " + znakStopnia + "C to " + tempCtoK + " K");
    }

    // Kelvin to Celsius
    private static void KtoC(double temp) {
        double tempKtoC;
        char znakStopnia = 176;
        tempKtoC = temp - 273.15;
        System.out.println(temp + "  K to " + tempKtoC + " " + znakStopnia + "C");
    }

    // Kelvin to Fahrenheit
    private static void KtoF(double temp) {
        double tempKtoF;
        tempKtoF = temp * 1.8 - 459.67;
        System.out.println(temp + "  K to " + tempKtoF + " F");
    }

    // Fahrenheit to Kelvin
    private static void FtoK(double temp) {
        double tempFtoK;
        tempFtoK = (temp + 459.67) * 5 / 9;
        System.out.println(temp + "  F to " + tempFtoK + " K");
    }
}
