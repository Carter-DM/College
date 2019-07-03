package javacp2560.lab2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Data {
    private static Random random = new Random();
    public static Map generateQuestionAndAnswers(int difficulty){
        Map<String, String> questionAndAnswers = new HashMap<>();
        int upperBound = 0;
        int lowerBound = 0;

        switch (difficulty){
            case 0:
                upperBound = 10;
                lowerBound = 0;
                break;
            case 1:
                upperBound = 30;
                lowerBound = 10;
                break;
            case 2:
                upperBound = 50;
                lowerBound = 20;
                break;
        }


        int num1 = (int) lowerBound + random.nextInt(upperBound - lowerBound + lowerBound);
        int num2 = (int) lowerBound + random.nextInt(upperBound - lowerBound + lowerBound);

        int operator = (int) random.nextInt(3);

        switch (operator){
            case 0:
                addition(questionAndAnswers, num1, num2);
                break;
            case 1:
                subtraction(questionAndAnswers, num1, num2);
                break;
            case 2:
                multiplication(questionAndAnswers, num1, num2);
                break;
        }

        return questionAndAnswers;
    }

    private static void addition(Map<String, String> questionAndAnswers, int num1, int num2){
        questionAndAnswers.put("question", num1 + " + " + num2);
        questionAndAnswers.put("correctAnswer", String.valueOf(num1 + num2));
        questionAndAnswers.put("incorrectAnswer1", getBadAnswerPositive(num1 + num2));
        questionAndAnswers.put("incorrectAnswer2", getBadAnswerPositive(num1 + num2));
    }

    private static void subtraction(Map<String, String> questionAndAnswers, int num1, int num2){
        questionAndAnswers.put("question", num1 + " - " + num2);
        questionAndAnswers.put("correctAnswer", String.valueOf(num1 - num2));
        questionAndAnswers.put("incorrectAnswer1", getBadAnswerNegative(num1 - num2));
        questionAndAnswers.put("incorrectAnswer2", getBadAnswerNegative(num1 - num2));
    }

    private static void multiplication(Map<String, String> questionAndAnswers, int num1, int num2){
        questionAndAnswers.put("question", num1 + " x " + num2);
        questionAndAnswers.put("correctAnswer", String.valueOf(num1 * num2));
        questionAndAnswers.put("incorrectAnswer1", getBadAnswerPositive(num1 * num2));
        questionAndAnswers.put("incorrectAnswer2", getBadAnswerPositive(num1 * num2));
    }

    private static String getBadAnswerPositive(int correctAnswer){
        int difference = (int) random.nextInt(40 - 1) + 1;
        return String.valueOf(correctAnswer + difference);
    }

    private static String getBadAnswerNegative(int correctAnswer){
        int difference = (int) random.nextInt(40 - 1) + 1;
        return String.valueOf(correctAnswer - difference);
    }
}
