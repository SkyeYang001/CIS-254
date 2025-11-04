/**
 * Bank Account Application Tester
 * 
 * @author Hellen Pacheco
 */
public class App {

    public static void main(String[] args) {

        int option = 0;
        double amount = 0.0;
        BankAccount account = new BankAccount(100);
        // System.out.println("New Account Balance: " + account.getBalance());
        try {
            System.out.println("Withdrawing 200");
            account.withdraw(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // System.out.println("New Balance: " + account.getBalance());
        try {
            System.out.println("Withdrawing -100");
            account.withdraw(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // System.out.println("New Balance: " + account.getBalance());

        try {
            System.out.println("Depositing -100");
            account.deposit(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // System.out.println("New Balance: " + account.getBalance());

        try {
            System.out.println("Depositing 1000");
            account.deposit(-100);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Withdrawing 200");
            account.withdraw(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("*************************************");
        // System.out.println(account.getStatement());
    }

}
