package ZadaniaSDA;

public class SDAzadanie09 {
    public static void main(String[] args) {
        /*
        Napisz program, który wydrukuje na ekran następujący tekst
         "To jest komunikat w pętli X" , pięć razy.
         Gdzie X to numer wyświetlonego komunikatu.
         */

        int x = 0;

        System.out.println("To jest Komunikat w pętli X");
        while (x <= 4){
            System.out.println("To jest "+ x + " komunikat w pętli.");
            x++;
        }

    }
}
