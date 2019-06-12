package javacp2560.assignment3;

import java.io.*;
import java.util.Scanner;

/**
 * Java CP2560 Assignment 3 Question 2 class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Part2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            // Streaming Error logs to Error.txt
            PrintStream out = new PrintStream(new FileOutputStream("src\\javacp2560\\assignment3\\Error.txt"));
            System.setErr(out);

            System.out.println("Enter file path: ");
            String filePath = in.nextLine();

            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            System.out.printf("\nFile name: %s\nAbsolute path: %s\nFile length: %s bytes\n", file.getName(), file.getAbsolutePath(), file.length());

            // Iterating and printing lines
            System.out.printf("Contents:\n\n");
            String line;
            while ((line=reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();
            in.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
