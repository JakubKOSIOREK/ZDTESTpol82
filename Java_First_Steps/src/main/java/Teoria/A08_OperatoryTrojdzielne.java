package Teoria;

public class A08_OperatoryTrojdzielne {
    public static void main(String[] args) {

        /*
        Operator znak zapytania '?'
         */

        // Obliczanie wartości bezwzględnej z liczby całkowitej |x| //
        int x = -5;

        if (x < 0){     // jeżeli x < 0 to wykonaj poniżej
            x = -x;     // x = x * -1 -> wartość bezwzględna zawsze jest dodatnia
        }
        System.out.println("\n" + x);

        // zastąpienie instrukcji warunkowej if() operatorem trójdzielnym '?'
        x = x < 0 ? -x : x;             // <zmienna> = (<warunek dla zmiennej> ? <warunek = true> : <warunek = false>)
                                        //     x          jeżeli    x < 0      to    x = -x              x = x
        System.out.println("\n" + x);
    }
}
