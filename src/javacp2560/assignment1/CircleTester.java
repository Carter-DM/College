package javacp2560.assignment1;

/**
 * Circle tester class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class CircleTester {
    public static void main(String[] args) {
        Shape circ1 = new Circle(2.0);
        Shape circ2 = new Circle(15.0);
        Shape circ3 = new Circle(0.0);

        System.out.printf("Expected: %.2f. Actual: %.2f\n", 12.57, circ1.getArea());
        System.out.printf("Expected: %.2f. Actual: %.2f\n", 706.86, circ2.getArea());
        System.out.printf("Expected: %.2f. Actual: %.2f\n", 0.0, circ3.getArea());
    }
}
