package javacp2560.assignment1;

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
    public static Shape generateShape(){
        double rand = Math.random();

        if (rand > 0.5){
            return new Circle(Math.random() * 30 + 1);
        }
        else{
            return new Rectangle((Math.random() * 30 + 1), (Math.random() * 30 + 1));
        }
    }
}
