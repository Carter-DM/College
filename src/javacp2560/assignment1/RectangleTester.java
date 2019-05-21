package javacp2560.assignment1;

/**
 * Rectangle tester class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class RectangleTester {
    public static void main(String[] args) {
        Shape rect1 = new Rectangle(2.0, 2.0);
        Shape rect2 = new Rectangle(15.0, 1.0);
        Shape rect3 = new Rectangle(0.0, 34567.5235);

        System.out.printf("Expected: %.2f. Actual: %.2f\n", 4.0, rect1.getArea());
        System.out.printf("Expected: %.2f. Actual: %.2f\n", 15.0, rect2.getArea());
        System.out.printf("Expected: %.2f. Actual: %.2f\n", 0.0, rect3.getArea());
    }
}
