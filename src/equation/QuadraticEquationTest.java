package equation;

/**
 * Created by Adrian on 2017-02-25.
 */
public class QuadraticEquationTest {

    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1,4,1);
        if (equation.calcDelta() < 0) {
            System.out.println("Delta ujemna");
        }else {
            System.out.println("Delta dodatnia");
            //TODO
        }
    }
}
