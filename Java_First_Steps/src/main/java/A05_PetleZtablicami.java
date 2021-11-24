public class A05_PetleZtablicami {
    public static void main(String[] args) {


        int[] tablica = {3, 5, 8, 1};   //zmienna <tablica> z zadeklarowanymi danymi typu int o długości 4

        System.out.println("\nWyświetlanie danych z tabeli - przykład 1\n");
        System.out.println(tablica[0] + " - to jest 1 wartość = komórka 0 w tablicy");
        System.out.println(tablica[1] + " - to jest 2 wartość = komórka 1 w tablicy");
        System.out.println(tablica[2] + " - to jest 3 wartość = komórka 2 w tablicy");
        System.out.println(tablica[3] + " - to jest 4 wartość = komórka 3 w tablicy");

        //!! komórki w tablicach zaczynają się od '0' a nie od '1' !!

        System.out.println("---------------------------------------------");

        //wyświetlanie danych z tablicy przy pomocy pętli for()

        System.out.println("\nWyświetlanie danych z tabeli - pętla < for() > \n");

        int komorka = 0;
        int wartosc = 1;

        for (int i =0; i < tablica.length; i++) {    //<.length> -> automatycznie zlicza długośc zmiennej <tablica>
            //zacznij od '0'; dla 'i' mniejszego od długości tablicy TRUE; po wykonaniu instrukcji zwiększ o 1

            System.out.println(tablica[i] + " - to jest " + wartosc + " wartość = komórka " + komorka + " z tablicy");

            komorka++;
            wartosc++;
        }

        System.out.println("---------------------------------------------");

        //wyświetlanie danych z tablicy przy pomocy pętli for z funkcją <eatch>

        System.out.println("\nWyświetlanie danych z tabeli - pętla < for() > z funkcją each < : > \n");

        int komorka1 = 0;
        int wartosc1 = 1;

        for (int pobranyElement : tablica){

            System.out.println(pobranyElement + " - to jest " + wartosc1 + " wartość = komórka " + komorka1 + " z tablicy");

            komorka1++;
            wartosc1++;
        }
        System.out.println("---------------------------------------------");
    }
}
