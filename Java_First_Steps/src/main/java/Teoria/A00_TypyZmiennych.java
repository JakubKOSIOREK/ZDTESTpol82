package Teoria;

public class A00_TypyZmiennych {                //ciało klasy
    public static void main(String[] args) {    //ciało programu

        byte liczbaCalkowita;                   //zmienna o nazwie liczbaCałkowita typu byte [–128; 127]
        liczbaCalkowita = 3;                    //zmienna byte równa się 3

        int liczbaCalkowita2;                   //zmienna o nazwie liczbaCałkowita typu int [–2147483648; 2147483647]
        liczbaCalkowita2 = 128;                 //zmienna byte równa się 128

        double liczbaRzeczywista = 228.9;       //zmienna tupu double, liczby zmiennoprzecinkowej [–1.7976931348623157E308; 1.7976931348623157E308]

        char zmiennaZnakowa = 'c';              //zmienna do wyświetlania znaków UNICODE -> tu litera 'c' WAŻNE apostrofy
        char zmiennaZnakowa2 = 99;              //c w UNICOD-zie jest [U+0063] ale wpisujemy wartość Dec: 99

        boolean zmiennaLogiczna = false;        //zmienna zwracająca wartości logiczne true / false -> tu równa się false

        final double STALA_PI = 3.1416;          //stała matematyczna Pi -> final <rodzaj zmiennej> = wartość


        System.out.println(liczbaCalkowita);        //wyświetla wartość zmiennej liczbaCalkowita
        System.out.println(liczbaCalkowita2);       //wyświetla wartość zmiennej liczbaCalkowita2
        System.out.println(liczbaRzeczywista);      //wyświetla wartość zmiennej liczbaRzeczywista
        System.out.println(zmiennaLogiczna);        //wyświetla wartość zmiennaLogiczna
        System.out.println(zmiennaZnakowa);         //wyświetla wartość zmiennaZnakowa
        System.out.println(zmiennaZnakowa2);

        System.out.println(liczbaCalkowita + liczbaCalkowita2); //wyświetla wynik działania dodawania

        System.out.println("Liczba Całkowita = " + liczbaCalkowita);    //wyświetla kolejno napis i wartość dodaną


    }
}