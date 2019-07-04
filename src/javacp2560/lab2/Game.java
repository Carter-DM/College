package javacp2560.lab2;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.*;

public class Game {
    JLabel questionLabel;
    JLabel buttons;
    JButton button1;
    JButton button2;
    JButton button3;
    int difficulty;
    int correctButton;

    public Game(JLabel questionLabel, JLabel buttons, JButton button1, JButton button2, JButton button3){
        this.questionLabel = questionLabel;
        this.buttons = buttons;
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
    }

    public void setDifficultyAndStart(int difficulty){
        this.difficulty = difficulty;
        buttons.remove(button1);
        buttons.remove(button2);
        buttons.remove(button3);
        JButton answerButton1 = new JButton();
        JButton answerButton2 = new JButton();
        JButton answerButton3 = new JButton();
        answerButton1.addActionListener(e -> isCorrect(1));
        answerButton2.addActionListener(e -> isCorrect(2));
        answerButton3.addActionListener(e -> isCorrect(3));
        this.button1 = answerButton1;
        this.button2 = answerButton2;
        this.button3 = answerButton3;
        buttons.add(answerButton1);
        buttons.add(answerButton2);
        buttons.add(answerButton3);
        loop();
    }

    private void loop(){
        updateInterface();
    }

    private void isCorrect(int buttonNumber){
        if (buttonNumber == correctButton){
            JOptionPane.showMessageDialog(null,"Correct!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Oops! That was incorrect.");
        }
        loop();
    }

    private void updateInterface(){
        Map<String, String> questionsAndAnswers = Data.generateQuestionAndAnswers(difficulty);
        Random random = new Random();
        int correctAnswerButton = random.nextInt(3);
        switch (correctAnswerButton){
            case 0:
                button1.setText(questionsAndAnswers.get("correctAnswer"));
                button2.setText(questionsAndAnswers.get("incorrectAnswer1"));
                button3.setText(questionsAndAnswers.get("incorrectAnswer2"));
                correctButton = 1;
                break;
            case 1:
                button2.setText(questionsAndAnswers.get("correctAnswer"));
                button1.setText(questionsAndAnswers.get("incorrectAnswer1"));
                button3.setText(questionsAndAnswers.get("incorrectAnswer2"));
                correctButton = 2;
                break;
            case 2:
                button3.setText(questionsAndAnswers.get("correctAnswer"));
                button1.setText(questionsAndAnswers.get("incorrectAnswer1"));
                button2.setText(questionsAndAnswers.get("incorrectAnswer2"));
                correctButton = 3;
                break;
        }
        questionLabel.setText(questionsAndAnswers.get("question"));
    }
}
