
public class Foreach {

    public static void main(String[] args) {

        int[] liczby = {1,4,11,4};
        System.out.println("Suma : " + sum(liczby));

    }

    private static int sum(int[] tab) {
        int s = 0;
        for (int i: tab) {
            s += i;
        }
        return s;
    }
}
