package JavaCP2280.Assignment1;

/**
 * Account class
 *
 * @author Carter Daly-MacPhail
 */

public class Account {

    private double balance;

    /**
     * Constructor
     *
     * @param balance
     */
    public Account(double balance) {

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    /**
     * Credit method.
     * <p>Adds money to balance.</p>
     *
     * @param amount
     */
    public void credit(double amount) {

        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Cannot credit a negative amount.");
        }
    }

    /**
     * Debit method
     * <p>Withdraws money from balance.</p>
     *
     * @param amount
     */
    public void debit(double amount) {
        if ((amount > balance) || (amount < 0)) {
            System.out.println("Invalid debit.");
        } else {
            balance -= amount;
        }
    }

    /**
     * Reset method.
     * <p>Resets account balance to 0.</p>
     */
    public void reset() {
        this.balance = 0;
    }

    /**
     * getBalance
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * setBalance
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
