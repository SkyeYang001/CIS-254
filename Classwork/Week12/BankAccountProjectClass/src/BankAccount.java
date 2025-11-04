public class BankAccount {
    private double balance;
    StringBuilder transactions;

    // ** The default constructor method */
    BankAccount() {
        balance = 0.0;
        transactions = new StringBuilder();
    }

    /**
     * The overloaded constructor method
     * 
     * @param amount
     */
    BankAccount(double amount) {
        balance = amount;
        transactions = new StringBuilder();
    }

    double getBalance() {
        // transactions.append(Double.toString(balance) + "\n");
        return balance;
    }

    void deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount cannot be negative");
        } else {
            balance += amount;
            transactions.append("Date: ");
            transactions.append("Deposited: " + amount);
        }
    }

    /**
     * 
     * @param amount
     * @return 1 if the operation was succesful, -1 if not
     */

    void withdraw(double amount) throws Exception{
        if ((amount < 0)) {
            throw new Exception("Amount cannot be negative");
        } else if  (balance < amount){
            throw new Exception("Not enough funds");
        } else {
            balance -= amount;
        }
    }

    StringBuilder getStatement() {
        return transactions;
    }
}
