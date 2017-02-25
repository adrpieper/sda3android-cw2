
public class Zad6 {

    public static void main(String[] args) {

        System.out.println("Pole kwadratu o boku 4 : " + poleKwadratu(4));
        System.out.println("Pole sześcianu o boku 2 : " + poleSzescianu(2));
        System.out.println("Pole koła o promieniu 1 : " + poleKola(1));
        System.out.println("Objętość walca o promieniu 1 i wysokości 10 : " + objetoscWalca(1,10));
        System.out.println("Objętość stożka o promieniu 1 i wysokości 10 : " + objetoscStozka(1,10));
        System.out.println("Objętość sześcianu o boku 2 : " + objetoscSzescianu(2));
        System.out.println("Objętość ostrosłupa o boku 2 i wysokości 9 : " + objetoscOstroslupa(2,9));
    }

    private static double poleKwadratu(double a) {
        return a*a;
    }

    private static double poleSzescianu(double a) {
        return poleKwadratu(a)*6;
    }

    private static double poleKola(double r) {
        return r*r*Math.PI;
    }

    private static double objetoscWalca(double r, double h) {
        return poleKola(r)*h;
    }

    private static double objetoscStozka(double r, double h) {
        return objetoscWalca(r,h)/3;
    }

    private static double objetoscSzescianu(double a) {
        return poleKwadratu(a)*a;
    }

    private static double objetoscOstroslupa(double a, double h) {
        return poleKwadratu(a)*h/3;
    }
}
