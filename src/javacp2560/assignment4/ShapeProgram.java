package javacp2560.assignment4;

import java.util.*;

/**
 * ShapeProgram class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class ShapeProgram {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            shapes.add(ShapeGenerator.generateShape());
        }

        printCollection(shapes);

        LinkedList<Shape> shapesList = new LinkedList<>();
        for(int i = 0; i < 15; i++){
            shapesList.add(ShapeGenerator.generateShape());
        }

        System.out.printf("\nSorted Linked List:\n\n");
        sortShapeList(shapesList);
        printCollection(shapesList);
    }

    /**
     * printCollection method using Iterator while loop
     * @param collection
     */
    private static void printCollection(Collection<Shape> collection){
        Iterator<Shape> iterator = collection.iterator();
        while(iterator.hasNext()){
            Shape currentShape = iterator.next();
            System.out.printf("%s. Area: %.2f\n", currentShape.getDescription(), currentShape.getArea());
        }
    }

    /**
     * sortShapeList method
     * @param list
     */
    private static void sortShapeList(List<Shape> list){
        Collections.sort(list, Comparator.comparingDouble(Shape::getArea));
    }
}
