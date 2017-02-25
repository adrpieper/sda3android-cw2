
public class Showman {

    public static void main(String[] args) {

        show((double) 4);
        show(4.0);
        Showman sho = new Showman();
        sho.show("HelloWorld");
    }

    private static void show(int i) {

        System.out.println(" liczba typu int : " + i);
    }
    private static void show(double i) {

        System.out.println(" liczba typu double : " + i);
    }
    private void show(String text) {

        System.out.println(" text : " + text);
    }
}
