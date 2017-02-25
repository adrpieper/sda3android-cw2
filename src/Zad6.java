
public class Zad6 {

    public static void main(String[] args) {

        System.out.println("Pole kwadratu o boku 4 : " + poleKwadratu(4));
        System.out.println("Pole sześcianu o boku 2 : " + poleSzescianu(2));
        System.out.println("Pole koła o boku 1 : " + poleKola(1));
    }

    private static double poleKwadratu(double a) {
        return a*a;
    }

    private static double poleSzescianu(double a) {
        return a*a*6;
    }

    private static double poleKola(double r) {
        return r*r*Math.PI;
    }
}
