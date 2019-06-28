package javacp2560.lab1;

import javax.swing.*;
import java.awt.*;

/**
 * TestFrame Swing GUI lab class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class TestFrame extends JFrame {

    /**
     * TestFrame constructor
     * @param numberOfLabels
     */
    TestFrame(int numberOfLabels){
        super("Lab 1 - TestFrame");
        setLayout(new FlowLayout());
        setSize(400, 400);

        for (int i = 1; i <= numberOfLabels; i++){
            JLabel label = new JLabel("label " + i);
            add(label);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        int numberOfLabels = Integer.valueOf(JOptionPane.showInputDialog("Enter the number of labels you want in the JFrame: "));
        TestFrame frame = new TestFrame(numberOfLabels);
        frame.setVisible(true);
    }
}
