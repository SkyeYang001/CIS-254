import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Lab 4 Partner Group 11
 * Description:
 * A BankAccount class that allows deposits and withdrawals.
 * Checks deposits and withdrawals to see if they are reasonable.
 *
 * @author Skye Yang
 * @author Brian Young
 * @since 11/02/2025
 */

public class BankAccount {

    private int accountNumber;
    private double balance;
    private StringBuilder transactions;

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * The default constructor method
     * Initializes balance to zero and sets a default account number.
     * 
     * @param initialBalance The starting balance for the account.
     */

    public BankAccount() {
        this.accountNumber = 0;
        this.balance = 0.0;
        this.transactions = new StringBuilder("Account Statement for Acc# " + this.accountNumber + "\n");
        logTransaction(String.format("Account created. Initial Balance: $%.2f", this.balance));
    }

    /**
     * The overloaded constructor method
     * Initializes balance with a given amount and sets a default account number.
     *
     * @param initialBalance The starting balance for the account.
     */

    public BankAccount(double initialBalance) {
        this.accountNumber = 0;
        this.balance = initialBalance;
        this.transactions = new StringBuilder("Account Statement for Acc# " + this.accountNumber + "\n");

        logTransaction(String.format("Account created. Initial Balance: $%.2f", this.balance));
    }

    /**
     * Method to log transactions with timestamps.
     *
     * @param message The transaction details to log.
     */

    private void logTransaction(String message) {
        Date timestamp = Calendar.getInstance().getTime();
        this.transactions.append(DATE_FORMAT.format(timestamp))
                .append(" | ")
                .append(message)
                .append("\n");
    }

    /**
     * Method to deposit funds.
     * Amount must be positive.
     *
     * @param amount The amount to deposit.
     * @return 1 for success, -1 for failure.
     */

    public int deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            String logMsg = String.format("Deposit: +$%.2f | New Balance: $%.2f", amount, this.balance);
            logTransaction(logMsg);
            return 1; // String.format from Chapter 11.6; used logMsg for holding formatted message
        } else {
            String logMsg = String.format("Deposit FAILED: Amount $%.2f is invalid.", amount);
            logTransaction(logMsg);
            return -1;
        }
    }

    /**
     * Method to withdraw funds.
     * Amount must be positive and less than or equal to the balance.
     *
     * @param amount The amount to withdraw.
     * @return 1 for success, -1 for failure.
     */

    public int withdraw(double amount) {
        if (amount <= 0) {
            String logMsg = String.format("Withdraw FAILED: Amount $%.2f is invalid.", amount);
            logTransaction(logMsg);
            return -1;
        } else if (amount > this.balance) {
            String logMsg = String.format("Withdraw FAILED: Insufficient funds. Tried $%.2f, Balance $%.2f", amount,
                    this.balance);
            logTransaction(logMsg);
            return -1;
        } else {
            this.balance -= amount;
            String logMsg = String.format("Withdrawal: -$%.2f | New Balance: $%.2f", amount, this.balance);
            logTransaction(logMsg);
            return 1;
        }
    }

    /**
     * Method to get the current balance.
     * 
     * @return The current account balance.
     */

    public double getBalance() {
        return this.balance;
    }

    /**
     * 5. Method to return the full transaction statement.
     * This method appends the *current* final balance to the string it returns,
     * without modifying the permanent transaction log.
     *
     * @return A string containing all account transactions.
     */

    public String getStatement() {
        return this.transactions.toString()
                + "\n"
                + String.format(
                        "Final balance as of " + DATE_FORMAT.format(Calendar.getInstance().getTime()) + ": $%.2f",
                        this.balance);
    }
}