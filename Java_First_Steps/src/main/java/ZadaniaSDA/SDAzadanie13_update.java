package ZadaniaSDA;

public class SDAzadanie13_update {
    public static void main(String[] args) {

        // tworzenie tablicy
        int[] tablica = new int[10];

        // wpisywanie wartości do komórek tablicy
        for (int i = 0; tablica.length > i; i++ ) {
            tablica[i] = (int) (Math.random() * 20 - 10);
        }

        // wyświetlanie wartości wpisanych do tablicy
        for (int i = 0; i < tablica.length; i++ ) {
            System.out.println("Wartość z tablicy: " + tablica[i]);
        }

        // wywołanie metody getMax() w celu wyświetlenia wartości max
        int max = getMax(tablica);
        System.out.println("Maksimum wynosi: " + max);

        // wywołanie metody getMin() w celu wyświetlenia wartości min
        int min = getMin(tablica);
        System.out.println("Minimum wynosi: " + min);
    }

    // metoda wyznaczająca wartość max w tablicy
    public static int getMax(int[] tablica){
        int maxValue = tablica[0];
        for(int i = 1; i < tablica.length; i++){
            if(tablica[i] > maxValue){
                maxValue = tablica[i];
            }
        }
        return maxValue;
    }

    // metoda wyznaczająca wartość minimalną w tablicy
    public static int getMin(int[] tablica){
        int minValue = tablica[0];
        for(int i = 1; i < tablica.length; i++){
            if(tablica[i] < minValue){
                minValue = tablica[i];
            }
        }
        return minValue;
    }
}