package javacp2280.inclass;

/**
 * Abstract base class for Shape Hierarchy
 */
public abstract class Shape {

    /**
     * Calculate the Shapes Area
     * @return
     */
    public abstract double getArea();

    /**
     * Print a description
     * @return
     */
    public String getDescription(){
        return "I am a Shape!";
    }
}