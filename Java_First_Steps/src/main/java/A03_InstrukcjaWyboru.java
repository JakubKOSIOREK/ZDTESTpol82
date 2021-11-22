public class A03_InstrukcjaWyboru {
    public static void main(String[] args) {

        int zmienna = 1;

        switch (zmienna){               // <switch> wykona się od wartości równej <zmiennej> do końca
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("coś tam\n");        // \n -> dodaje odstęp między wierszami
        }

        System.out.println("instrukcja <switch> z dodatkową instrukcją <break>");

        switch (zmienna){
            case 1:
                System.out.println("1");
                break;                          // <break> powoduje wyjście z instrukcji <switch> gdy instrukcja <case> jest spełniona
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("coś tam");

        }
    }
}
