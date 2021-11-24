package Teoria;

public class A01_ZmienneTablicowe {
    public static void main(String[] args) {

        int[] tablica = {5,6,1,9,0};           //zadeklarowana zmienna int typu tablicowego WAŻNE -> [], można <int tablica []>

        System.out.println(tablica[0]);        //wypisuje wartość komórki 0 z tablicy ->5
        System.out.println(tablica[1]);        //wypisuje wartość komórki 1 z tablicy ->6
        System.out.println(tablica[2]);
        System.out.println(tablica[3]);
        System.out.println(tablica[4]);
        System.out.println("Ilość elementów w tablicy = " + tablica.length);

        tablica[4]= 7;                          //zmiana wartości w komórce 4 tablicy z 0 na 7
        System.out.println("zmieniona komórka 4 w tablicy " + tablica[4]);

        int[] tablica2;
        tablica2 = new int[3];         // określa długość tablicy
        tablica2[0] = 4;
        tablica2[1] = 5;
        tablica2[2] = 6;



        //tablica dwuwymiarowa

        double [][] macierz;                //zadeklarowana zmienna double jako tablica dwuwymiarowa -> WAŻNE [][]
        macierz = new double[3][4];         //zadeklarowanie wielkości macierzy/tabeli

        macierz[0][0] = 3;                  //dodaje wartość do maciezy/tabeli w K0 i W0
        macierz[1][3] = 8;                  //dodaje wartość do macierzy/tabeli w K1 i W3

        /* inny sposób wprowadzania danych:
        double [][] macierz = {{123},{456}};

        wyświetlanie
        System.out.println(macierz[0][0])
         */
        //tablice wielowymiarowe <zmienna> [][][][] <nazwaTablicy;> -> ilość [] świadczy o wymiarach tablicy

        System.out.println(macierz[0][0]);
        System.out.println(macierz[1][3]);
    }
}
