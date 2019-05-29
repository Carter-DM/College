package javacp2560.assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 * ShapeMain class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class ShapeMain {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            shapes.add(ShapeGenerator.generateShape());
        }

        for (Shape shape: shapes) {
            if (shape != null) {
                System.out.printf("%s. Area: %.2f\n\n", shape.getDescription(), shape.getArea());
            }
        }
    }
}
