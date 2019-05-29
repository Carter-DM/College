package javacp2560.assignment2;

/**
 * ShapeGenerator class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class ShapeGenerator {

    /**
     * generateShape static class
     * @return Shape
     */
    public static Shape generateShape() {
        double rand = Math.random();
        Shape shape = null;

        try {
            if (rand > 0.5) {
                shape = new Circle(Math.random() * 30 - 10);
            } else {
                shape = new Rectangle((Math.random() * 30 - 10), (Math.random() * 30 - 10));
            }
        } catch (InvalidShapeParameterException e) {
            System.out.printf("Invalid Shape parameter, values cannot be negative.\n\n");
        }
        finally {
            return shape;
        }
    }
}
