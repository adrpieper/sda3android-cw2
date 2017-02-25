
public class Zad5 {

    public static void main(String[] args) {

        int w = mnozenie(1,4);
        System.out.println(w);

        System.out.println(mnozenie(4,7));
        suma(mnozenie(3,4),10);
    }

    private static void suma(int a,int b) {

        int wynik = a + b;
        System.out.println(wynik);
    }

    private static int mnozenie(int a,int b) {
        int wynik = a * b;
        return wynik;
    }
}
