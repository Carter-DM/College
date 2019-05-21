package javacp2560.assignment1;

/**
 * Rectangle class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Rectangle extends Shape{
    private double length;
    private double width;

    /**
     * Rectangle constructor
     * @param length
     * @param width
     */
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /**
     * Override Shape getArea method
     * @return area
     */
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * Override Shape getDescription method
     * @return
     */
    @Override
    public String getDescription(){
        return String.format("A Rectangle with a length of: %.2f and a width of: %.2f", this.length, this.width);
    }

    /**
     * getLength method
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * setLength method
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * getWidth method
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * setWidth method
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }
}
