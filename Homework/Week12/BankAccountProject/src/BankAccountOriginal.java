
/**
 * Lab 4 Partner Group 11
 * Description: This program withdraws and deposits the desired amount of money and returns the balances and gives a statement record
 * 
 * @author Skye Yang
 * @author Brian Young
 * @since 11/0/2025
 */
import java.util.Calendar;
import java.util.Random;

public class BankAccountOriginal {
    StringBuilder accountNumber;
    private double balance;
    double withdraws = 0;
    double deposits = 0;
    StringBuilder transactions;
    Calendar currentDate = Calendar.getInstance();
    int currentYear = currentDate.get(Calendar.YEAR);
    int currentMonth = currentDate.get(Calendar.MONTH);
    int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
    Random random = new Random();

    // ** The default constructor method */
    BankAccount() {
        balance = 0.0;
        transactions = new StringBuilder();
        accountNumber = new StringBuilder();
    }

    // ** The overloaded constructor method */
    BankAccount(double amount) {
        balance = amount;
        transactions = new StringBuilder();
        accountNumber = new StringBuilder();
        for (int x = 0; x < 11; x++) {
            accountNumber.append(Integer.toString(random.nextInt(9)));
            // accountNumber.append("1");
        }
        transactions.append("Account Number: " + accountNumber + "\n");
        transactions.append(Integer.toString(currentYear) + "/" + Integer.toString(currentMonth) + "/"
                + Integer.toString(currentDay) + ": ");

        transactions.append("Balance: " + Double.toString(amount) + "\n");
    }

    /**
     * @author Skye Yang
     *         This is the return balance method
     * @return balance
     */
    double getBalance() {
        return balance;
    }

    int withdraw(double amount) {
        transactions.append(Integer.toString(currentYear) + "/" + Integer.toString(currentMonth) + "/"
                + Integer.toString(currentDay) + ": ");
        if ((amount > 0) && (balance >= amount)) {
            withdraws += amount;
            balance -= amount;
        } else {
            transactions.append("Withdraw: " + Double.toString(amount) + " ");
            transactions.append("Balance: " + Double.toString(balance) + "\n");
            return -1;
        }
        transactions.append("Withdraw: " + Double.toString(amount) + " ");
        transactions.append("Balance: " + Double.toString(balance) + "\n");
        return 1;
    }

    int deposit(double amount) {
        transactions.append(Integer.toString(currentYear) + "/" + Integer.toString(currentMonth) + "/"
                + Integer.toString(currentDay) + ": ");
        if (amount < 0) {
            transactions.append("Deposit: " + Double.toString(amount) + " ");
            transactions.append("Balance: " + Double.toString(balance) + "\n");
            return -1;
        } else {
            deposits += amount;
            balance += amount;
            transactions.append("Deposit: " + Double.toString(amount) + " ");
            transactions.append("Balance: " + Double.toString(balance) + "\n");
            return 1;
        }
    }

    /**
     * @author Skye Yang
     *         This is the return transactions method
     * @return transactions
     */
    StringBuilder getStatement() {
        // transactions.append(Integer.toString(currentYear) + "/" +
        // Integer.toString(currentMonth) + "/"
        // + Integer.toString(currentDay) + ": ");
        // transactions.append("Totals: " + Double.toString(balance) + "\n");
        transactions.append(
                "Totals: Withdraws: " + Double.toString(withdraws) + " Deposits: " + Double.toString(deposits) + "\n");
        return transactions;
    }
}
