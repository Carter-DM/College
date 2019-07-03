package javacp2560.lab2;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map questionAndAnswer;
        for (int i = 0; i < 20; i++){
            questionAndAnswer = Data.generateQuestionAndAnswers(2);
            System.out.println("Question: " + questionAndAnswer.get("question"));
            System.out.println("Correct Answer: " + questionAndAnswer.get("correctAnswer"));
            System.out.println("Incorrect Answer 1: " + questionAndAnswer.get("incorrectAnswer1"));
            System.out.println("Incorrect Answer 2: " + questionAndAnswer.get("incorrectAnswer2"));
            System.out.println("-----------------------");
        }
    }
}
