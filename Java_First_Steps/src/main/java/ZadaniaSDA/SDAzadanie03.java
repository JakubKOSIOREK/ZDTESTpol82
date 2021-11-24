package ZadaniaSDA;

public class SDAzadanie03 {
    public static void main(String[] args) {
        /*
        Napisz program, w którym zainicjalizujesz zmienne typu
        int, long, double oraz przypiszesz do nich następujące wartości:

        int -> i = 100000000000000000000000
        long -> l = -900000000000000000000000
        double -> d = 100

        Sprawdź, czy kod zbudował się prawidłowo? Co poszło nie tak?
         */

        int i = 1000;
        long l = -9000;
        double d = 100;

        System.out.println(i);
        System.out.println(l);
        System.out.println(d);

        /*
        Odpowiedź - zmienne i oraz l są typu int oraz long.
        Wartości przypisane do zmiennych wychodzą poza zakres tych typów zmiennych.
        Przepisz program, w taki sposób, aby kod zbudował się bez błędów,
        a wartości zmiennych zostały wypisane na ekran.
        Przykładowe rozwiązanie:

         int i = 1000;
         long l = -90000;
         */

    }
}
