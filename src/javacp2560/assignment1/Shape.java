package javacp2560.assignment1;

/**
 * Abstract base class for Shape Hierarchy
 */
public abstract class Shape {
   protected String description;

    /**
     * Calculate the Shapes Area
     * @return area
     */
    public abstract double getArea();


    /**
     * Set description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Print a description
     * @return description
     */
    public String getDescription(){
        return this.description;
    }
}
