package javacp2560.assignment3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Java CP2560 Assignment 3 Question 1 class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Part1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter file name: ");
            String fileName = in.nextLine();

            File file = new File("src\\javacp2560\\assignment3", fileName);

            System.out.println("Enter a phrase: ");
            String input = in.nextLine();

            FileWriter writer = new FileWriter(file);
            writer.write(input);

            file.createNewFile();
            writer.flush();
            writer.close();
            in.close();

            System.out.printf("File name: %s\nAbsolute path: %s\nFile length: %s bytes", file.getName(), file.getAbsolutePath(), file.length());

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
