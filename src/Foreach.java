
public class Foreach {

    public static void main(String[] args) {

        int[] liczby = {1,4,11,4};
        System.out.println("Suma : " + sum(liczby));
        System.out.println("Iloczyn : " + iloczyn(new int[]{1,2,4}));

    }

    private static int sum(int[] tab) {
        int s = 0;
        for (int i: tab) {
            s += i;
        }
        return s;
    }

    private static int iloczyn(int[] tab) {
        int s = 1;
        for (int i: tab) {
            s *= i;
        }
        return s;
    }
}
