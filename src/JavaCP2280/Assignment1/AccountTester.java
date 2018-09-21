package JavaCP2280.Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Simple tester for Account Class
 */
public class AccountTester {

    public static void main(String[] args) {
        //Set up the scanner from the console
        Scanner consoleInput = new Scanner(System.in);
        String userInput;   //capture the users input

        //Start off with an empty account
        Account account = new Account(0.0);

        do{
            System.out.printf("Account balance: %f\n", account.getBalance());
            System.out.println("Account management options: \n" +
                    "\tCredit the account [C]\n" +
                    "\tDebit the account [D]\n" +
                    "\tReset the account balance [R]\n" +
                    "\tQuit [X]\n" +
                    "Enter selection:");
            userInput = consoleInput.next();
            try {
                if (userInput.equals("C") || userInput.equals("c")) {
                    System.out.println("Enter the amount of money to be added to the account:");
                    account.credit(consoleInput.nextDouble());
                } else if (userInput.equals("D") || userInput.equals("d")) {
                    System.out.println("Enter the amount of money to withdraw from the account:");
                    account.debit(consoleInput.nextDouble());
                } else if (userInput.equals("R") || userInput.equals("r")) {
                    account.reset();
                    System.out.println("Account reset.");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input.");
            }

            //System.out.printf("\nDEBUG s: %s\n", userInput);
        } while (!(userInput.equals("X")||userInput.equals("x"))); //Not X


    }

}