package JavaCP2280.Assignment1;

/**
 * Account class
 *
 * @author Carter Daly-MacPhail
 */

public class Account {

    private double balance;

    public Account(double balance) {
        /**
         * Constructor
         * @param initialBalance
         */
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void credit(double amount) {
        /**
         * Credit method.
         * <p>Adds money to balance.</p>
         * @param amount
         */
        if (amount > 0){
            balance += amount;
        }
        else{
            System.out.println("Cannot credit a negative amount.");
        }
    }

    public void debit(double amount) {
        /**
         * Debit method.
         * <p>Withdraws money from balance.</p>
         * @param amount
         */
        if ((amount > balance) && (amount > 0)) {
            System.out.println("Debit amount exceeded account balance.");
        }
        else {
            balance -= amount;
        }
    }

    public void reset(){
        /**
         * Reset method.
         * <p>Resets account balance to 0.</p>
         */
        this.balance = 0;
    }

    public double getBalance() {
        /**
         * Get Balance method
         * @return balance
         */
        return balance;
    }

    public void setBalance(double balance) {
        /**
         * Set Balance method
         * @param balance
         */
        this.balance = balance;
    }

}
