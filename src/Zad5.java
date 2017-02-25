
public class Zad5 {

    public static void main(String[] args) {

        int w = mnozenie(1,4);
        System.out.println(w);

        System.out.println(mnozenie(4,7));
        suma(mnozenie(3,4),10);
        int i = 10;
        suma(i,5);
        System.out.println(i);
        int[] tab = {2,34,3,2,1,11};
        int tabMin = min(tab);
        System.out.println("tabMin="+tabMin);
    }

    private static void suma(int c,int d) {

        c = 100;
        int wynik = c + d;
        System.out.println(wynik);
    }

    private static int mnozenie(int a,int b) {
        int wynik = a * b;
        return wynik;
    }

    private static int min(int[] tab) {
        int m = Integer.MAX_VALUE;
        for (int i = 0 ; i < tab.length; i++){
            if (m > tab[i]) {
                m = tab[i];
            }
        }
        return m;
    }
}
