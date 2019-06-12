package javacp2560.assignment3;

import javacp2560.assignment2.InvalidShapeParameterException;

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

        while (shape == null) {
            try {
                if (rand > 0.5) {
                    shape = new Circle(Math.random() * 30 + 1);
                } else {
                    shape = new Rectangle((Math.random() * 30 + 1), (Math.random() * 30 + 1));
                }
            } catch (InvalidShapeParameterException e) {
                System.err.printf("Invalid Shape parameter, values cannot be negative.\n\n");
            }
        }
        return shape;
    }
}
