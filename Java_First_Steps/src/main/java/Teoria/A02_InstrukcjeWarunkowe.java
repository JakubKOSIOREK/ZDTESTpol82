package Teoria;

public class A02_InstrukcjeWarunkowe {

    public static void main(String[] args) {


        int zmienna = 5;


        if (zmienna == 5) {                                  // <if (warunek) {instrukcja}
            System.out.println(" Zmienna = " + zmienna);     //instrukcja do wykonania
        }

        int zmienna1 = 6;

        if (zmienna1 == 5) {                                  // jeżeli zmienna = 5 to
            System.out.println(" Zmienna1 = 5");              //instrukcja do wykonania
        } else {                                             //jeżeli zmienna nie jest równa to
            System.out.println("Zmienna1 różna od 5");        //instrukcja do wykonania
        }

        int zmienna2 = 7;
        if (zmienna2 == 5) {                                 // jeżeli zmienna = 5 to
            System.out.println(" Zmienna2 = 5");             //instrukcja do wykonania
        } else if (zmienna2 == 6) {                          //jeżeli zmienna = 6 to
            System.out.println("Zmienna2 = 6");              //instrukcja do wykonania
        } else {                                            //jeżeli zmienna nie jest równa to
            System.out.println("Zmienna2 różna od 5 i 6");   //instrukcja do wykonania
        }

        /*
            && -> i
            || -> lub
            == -> równa się
            ! -> różne
            ^ -> różnica

         */

        int x = 10, y = 20;                             //wartość x=10 i y=20

        if ((x == 10) && (y == 20)) {                   //jeżeli x=10 i y=10 (x i y = TRUE) to
            System.out.println("x="+ x + " y=" + y);            //instrukcja do wykonania
        }
    }
}
