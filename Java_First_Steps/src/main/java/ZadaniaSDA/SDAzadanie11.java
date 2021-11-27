package ZadaniaSDA;

import java.util.Scanner;

public class SDAzadanie11 {
    public static void main(String[] args) {

        /*
        Napisz program, który pobiera hasło od użytkownika.
        Program powinien zapytać użytkownika o wprowadzenie poprawnego hasła.
        W przypadku gdy wprowadzone hasło będzie poprawne (secretpassword), program powinien wydrukować
        na ekranie tekst "Poprawne hasło", w przeciwnym wypadku, wprowadzone hasło powinno zostać wyświetlone
        na ekranie, a użytkownik powinien mieć możliwość ponownie wprowadzić hasło.
         */

        Scanner klawiatura = new Scanner(System.in);

        String password;
        String correctPasswort = "secretpassword";      //zmienna typu string -> do wprowadzania łańcucha tekstowego

        do{
            System.out.println("\nPodaj hasło:");
            password = klawiatura.next();
            if (password.equals(correctPasswort)){       // metoda equals() porównuje hasła
                System.out.println("Poprawne hasło");
                break;                                   // przerwanie pętli jeśli warunek if() jest spełniony
            }else {
                System.out.println(password);
                System.out.println("Niepoprawne hasło");
            }
        }while(true);                                   // warunek typu boolen gdy używamy instrukcji break
    }
}
