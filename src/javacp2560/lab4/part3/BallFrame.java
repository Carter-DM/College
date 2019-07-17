package javacp2560.lab4.part3;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BallFrame extends JFrame {

    public BallFrame(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                addBall();
            }
            @Override
            public void keyPressed(KeyEvent e) { }
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }

    public void addBall(){
        Ball ball = new Ball("pink",3,2);
        getContentPane().add(ball);
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(ball);
    }
}
