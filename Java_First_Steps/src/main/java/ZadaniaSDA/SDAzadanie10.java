package ZadaniaSDA;

import java.util.Scanner;

public class SDAzadanie10 {
    public static void main(String[] args) {

    /*
    Zmodyfikuj kod z poprzedniego zadania, w taki sposób,
    aby użytkownik samodzielnie podawał ilość wyświetlonych komunikatów.
    */

        // ZMIENNE
        int liczbaPetli;
        int x = 0;

        // WPROWADZANIE Z KLAWIATURY
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Ile komunikatów wyświetlić?");
        liczbaPetli = klawiatura.nextInt();
        System.out.println();

        // PROGRAM
        while (x < liczbaPetli){
            System.out.println("To jest "+ x + " komunikat w pętli.");
            x++;
        }
    }
}
