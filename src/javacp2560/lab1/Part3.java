package javacp2560.lab1;

import javax.swing.*;

/**
 * Part3 Swing GUI lab class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Part3 {
    private static final String IMAGE_URL = "src\\javacp2560\\lab1\\java_logo.png";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 1 - Part 3");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(IMAGE_URL));
        label.setToolTipText("This is an image displayed using a JFrame!");
        frame.add(label);

        frame.setVisible(true);
    }
}
