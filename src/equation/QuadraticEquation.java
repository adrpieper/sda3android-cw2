package equation;

/**
 * Created by Adrian on 2017-02-25.
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcDelta() {
        return b*b-4*a*c;
    }

    public double calcX1() throws DeltaException{
        if (calcDelta() < 0) {
            throw new DeltaException();
        }
        return (-b+Math.sqrt(calcDelta()))/(2*a);
    }

    public double calcX2() throws DeltaException{
        if (calcDelta() < 0) {
            throw new DeltaException();
        }
        return (-b-Math.sqrt(calcDelta()))/(2*a);
    }
}
