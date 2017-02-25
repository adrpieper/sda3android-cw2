/**
 * Created by Adrian on 2017-02-25.
 */
public class Zad8 {

    public static void main(String[] args) {
        show(4);
        show(4.0);
        show("HelloWorld");
    }

    private static void show(int i) {

        System.out.println(" liczba typu int : " + i);
    }
    private static void show(double i) {

        System.out.println(" liczba typu double : " + i);
    }
    private static void show(String text) {

        System.out.println(" text : " + text);
    }
}
