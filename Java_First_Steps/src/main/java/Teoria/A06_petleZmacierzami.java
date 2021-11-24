package Teoria;

public class A06_petleZmacierzami {
    public static void main(String[] args) {

        int[][] macierz = new int[2][3];        // macierz dwuwymiarowa o wymiarach 2 wiersze na 3 kolumny (pusta)

        System.out.println();
        System.out.println("Macierz z jedną wartością dla wszystkich komórek");
        System.out.println("-------------------------------------------------");

        //Wprowadzanie tych samych danych do komórek macierzy

        for (int w = 0; w < 2; w++){        // warunki do identyfikacji komórki z poziomu wiersza
            for (int k = 0; k < 3; k++){    // warunki do identyfikacji komórki z poziomu kolumny
                macierz[w][k] = 9;          // instrukcja wpisania cyfry 9 do wszystkich komórek macierzy
            }
        }
        //Wyświetlanie danych z komórek macierzy

        for (int w = 0; w < 2; w++){                    // warunki do identyfikacji komórki z poziomu wiersza
            for (int k = 0; k < 3; k++){                // warunki do identyfikacji komórki z poziomu kolumny
                System.out.println(macierz[w][k] + " ");  // instrukcja wyświetlania danych z komórek
            }
        }
        System.out.println("-------------------------------------------------");

        // Wyświetlanie danych z komórek macierzy według wierszy i kolumn

        for (int w = 0; w < 2; w++){                    // warunki do identyfikacji komórki z poziomu wiersza
            for (int k = 0; k < 3; k++){                // warunki do identyfikacji komórki z poziomu kolumny
                System.out.print(macierz[w][k] + " ");  // instrukcja wyświetlania danych z komórek
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Macierz z różnymi wartościami w komórkach");
        System.out.println("-------------------------------------------------");


        //Wprowadzanie różnych wartości danych do macierzy

        double[][] macierz1 = new double[2][3]; // macierz dwuwymiarowa o wymiarach 2 wiersze na 3 kolumny (pusta)

        for (int w = 0; w < 2; w++){
            for (int k = 0; k < 3; k++){
                macierz1[w][k] = Math.random(); // gotowa instrukcja wprowadzania losowych danych < Math.random() >
                                                // od 0 do 1
            }
        }
        for (int w = 0; w < 2; w++){
            for (int k = 0; k < 3; k++){
                System.out.print(macierz1[w][k] + "  ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Macierz z różnymi wartościami w komórkach");
        System.out.println("-------------------------------------------------");


        //ograniczanie przedziału wartości wprowadzanych do macierzy

        for (int w = 0; w < 2; w++){
            for (int k = 0; k < 3; k++){
                macierz1[w][k] = Math.random() * 20 - 10;   // < * 20 - 10 > to działanie ogranicza losowość
                                                            // do przedziału od -10 do 10
            }
        }
        System.out.println("Macierz z różnymi wartościami w komórkach z przedziału od -10 do +10\n");

        for (int w = 0; w < 2; w++){
            for (int k = 0; k < 3; k++){
                System.out.print(macierz1[w][k] + "  ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");

        //Rzutowanie wartości - zmiana typu zmiennych

        double[][] macierz2 = new double[2][3]; // macierz dwuwymiarowa o wymiarach 2 wiersze na 3 kolumny (pusta)
        for (int w = 0; w < 2; w++){
            for (int k = 0; k < 3; k++){
                macierz2[w][k] = (int) (Math.random() * 20 - 10);   // dodanie (int) zmienia typ double w metodzie random na int
            }
        }
        System.out.println("Macierz z różnymi wartościami w komórkach z przedziału od -10 do +10");
        System.out.println("po zmianie typu zmiennej z double na int w klasie Math z metodą random\n");

        for (int w = 0; w < 2; w++){
            for (int k = 0; k < 3; k++){
                System.out.print(macierz2[w][k] + "  ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");

        int[][] macierz3 = new int[2][3]; // macierz dwuwymiarowa o wymiarach 2 wiersze na 3 kolumny (pusta)
        for (int w = 0; w < 2; w++){
            for (int k = 0; k < 3; k++){
                macierz3[w][k] = (int) (Math.random() * 20 - 10);   // dodanie (int) zmienia typ double w random na int
            }
        }
        System.out.println("Macierz z różnymi wartościami w komórkach z przedziału od -10 do +10");
        System.out.println("przy zmiennej <macierz> typu int\n");

        for (int w = 0; w < 2; w++){
            for (int k = 0; k < 3; k++){
                System.out.print(macierz3[w][k] + "  ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");


    }
}
