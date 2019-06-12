package javacp2560.assignment3;

import java.io.Serializable;

/**
 * Abstract base class for Shape Hierarchy
 */
public abstract class Shape implements Serializable {
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
