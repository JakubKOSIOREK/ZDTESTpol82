package ZadaniaSDA;

public class SDAzadanie09 {
    public static void main(String[] args) {
        /*
        Napisz program, który wydrukuje na ekran następujący tekst
         "To jest komunikat w pętli X" , pięć razy.
         Gdzie X to numer wyświetlonego komunikatu.
         */

        System.out.println();

        int x = 0;
        while (x < 5){
            System.out.println("To jest "+ x + " komunikat w pętli.");
            x++;
        }
    }
}
