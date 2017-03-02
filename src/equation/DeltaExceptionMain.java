package equation;

import java.util.Scanner;

/**
 * Created by Adrian on 2017-03-02.
 */
public class DeltaExceptionMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a");
        double a = scanner.nextDouble();
        System.out.println("Podaj b");
        double b = scanner.nextDouble();
        System.out.println("Podaj c");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        try {
            System.out.println("x1="+equation.calcX1());
            System.out.println("x2="+equation.calcX2());
        } catch (DeltaException e) {
            System.out.println("Delta jest ujemna!");
        }

    }
}
