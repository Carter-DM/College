package javacp2560.lab3;

import javax.swing.*;
import java.awt.*;

/**
 * Frame class extends JFrame
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Frame extends JFrame {
    public Frame(){
        super("Matching Game");
        setLayout(new GridLayout(2, 2));
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
}
