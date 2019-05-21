package javacp2560.assignment1;

/**
 * Circle class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Circle constructor
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Override Shape getArea method
     * @return area
     */
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Override Shape getDescription method
     * @return description
     */
    @Override
    public String getDescription() {
        return String.format("A Circle with a radius of: %.2f", this.radius);
    }

    /**
     * getRadius method
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setRadius method
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
