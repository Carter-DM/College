package javacp2560.assignment3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("ABSOLUTEPATH\\InputOutput.txt");

            System.out.println("Enter a phrase: ");
            String input = in.nextLine();
            writer.write(input);

            writer.flush();
            writer.close();
            in.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
