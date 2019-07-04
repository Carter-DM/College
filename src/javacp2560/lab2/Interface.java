package javacp2560.lab2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Interface extends JFrame {
    public Interface(){
        super("Math Quiz Game");
        setLayout(new GridLayout(0, 2));
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Interface frame = new Interface();
        JLabel questionLabel = new JLabel("To start, select a difficulty:");
        questionLabel.setBorder(new EmptyBorder(0, 10, 0, 10));

        frame.add(questionLabel);

        JLabel buttons = new JLabel();
        buttons.setLayout(new GridLayout(3, 0));
        JButton button1 = new JButton("Easy");
        buttons.add(button1);
        JButton button2 = new JButton("Medium");
        buttons.add(button2);
        JButton button3 = new JButton("Hard");
        buttons.add(button3);

        Game game = new Game(questionLabel, buttons, button1, button2, button3);

        button1.addActionListener(e -> game.setDifficultyAndStart(0));
        button2.addActionListener(e -> game.setDifficultyAndStart(1));
        button3.addActionListener(e -> game.setDifficultyAndStart(2));

        frame.add(buttons);

        frame.setVisible(true);
    }
}
