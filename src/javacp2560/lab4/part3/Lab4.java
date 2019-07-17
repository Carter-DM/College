/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacp2560.lab4.part3;


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ball ball1 = new Ball("red",3,2);
        Ball ball2 = new Ball("blue",3,2);
        BallFrame f = new BallFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(ball1);
        f.getContentPane().add(ball2);
        f.setSize(400,400);
        f.setLocation(200,200);
        f.setVisible(true);

        ExecutorService executor1 = Executors.newCachedThreadPool();
        ExecutorService executor2 = Executors.newCachedThreadPool();

        executor2.execute(ball2);
        executor1.execute(ball1);
    }
}
