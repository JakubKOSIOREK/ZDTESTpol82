public class A04_PetleWhileDoWhileFor {
    public static void main(String[] args) {

        int zmienna = 5;

        while (zmienna > 0){
            System.out.println(zmienna);
            zmienna = zmienna -1;                // wartość zmiennej zmniejszamy o 1 wartość, można użyć zamiennie --
        }
        System.out.println("------------");

        /*
        zmienna = 5, warunek w pętli czy zmienna jest większa od 0, jeżeli TRUE to wykonaj i wyświetl wartość, jeżeli FALSE to zakończ pętlę
        */


        int zmienna1 = 10;
        while (zmienna1 >= 3) {
            System.out.println(zmienna1);
            zmienna1--;                         // wartość zmiennej zmniejszamy o 1 wartość
        }
        System.out.println("koniec pętli while");

        // pętla do -> while
        int zmienna2 = 2;
        do{
            System.out.println(zmienna2);
            zmienna2--;
        } while (zmienna2 >=3);
        System.out.println(zmienna2);
        System.out.println("koniec pętli do-while");

        /*
        zmienna2 = 2, najpierw wykonaj instrukcję póżniej sprawdź warunek
         */

        // pętla for

        for(int zmienna3 = 6; zmienna3 >=3;zmienna3--){            //for(zmienna;warunek;zmiana zmiennej){instrukcja}
            System.out.println(zmienna3);
        }
        System.out.println("koniec pętli for");
    }
}
