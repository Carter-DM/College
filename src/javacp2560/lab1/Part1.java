package javacp2560.lab1;

import javax.swing.*;
import java.util.Random;

/**
 * Part1 Swing GUI lab class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Part1 {
    public static void main(String[] args) {
        Object[] options = {"Square number", "Guess number"};
        int selection = JOptionPane.showOptionDialog(null,
                "Selection one of the following options:",
                "Lab1",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                null);
        if (selection == 0){
            squareNumber();
        }
        else if (selection == 1){
            guessNumber();
        }
    }

    /**
     * <h2>squareNumber method</h2>
     * <p>Method that asks a user for input, squares it, then displays the result back using a JOptionPane.</p>
     */
    static void squareNumber(){
        String num = JOptionPane.showInputDialog("Enter a number to square:");
        double squared = Math.pow(Double.parseDouble(num),2);
        JOptionPane.showMessageDialog(null, num + " squared is: " + squared);
    }

    /**
     * <h2>guessNumber method</h2>
     * <p>Method that asks a user to guess a number between 1 and 10 until they get it.</p>
     */
    static void guessNumber(){
        Random random = new Random();
        int rand = (int) 1 + random.nextInt(10 - 1 + 1);
        String num = JOptionPane.showInputDialog("Guess an integer between 1 and 10:");
        int guesses = 1;
        while (Integer.valueOf(num) != rand){
            num = JOptionPane.showInputDialog("That's not it, try again! Guess an integer between 1 and 10:");
            guesses++;
        }
        JOptionPane.showMessageDialog(null, "You got it! It took you " + guesses + " tries to guess the number: " + rand);
    }
}
