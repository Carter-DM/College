package javacp2560.assignment3;

import java.io.*;

/**
 * Java CP2560 Assignment 3 Question 2 class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Part3 {

    public static void main(String[] args) {
        Shape shape = ShapeGenerator.generateShape();
        System.out.println(shape.getDescription());
        try {
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream("src\\javacp2560\\assignment3\\shape.ser"));
            objectOut.writeObject(shape);

            ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("src\\javacp2560\\assignment3\\shape.ser"));
            Shape shapeIn = (Shape) objectIn.readObject();

            System.out.println(shapeIn.getDescription());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
