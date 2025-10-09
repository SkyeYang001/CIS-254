package Homework.Week7;
import java.util.Scanner;

/**
 * Lab 1: This is a simple program that converts USD to Euros and Yuan
 * 
 * @author Jonah Martin
 * @author Skye Yang
 */
public class Conversion {
    /**
     * Prints a welcome message to the user and explains what the program does
     * 
     * @author Jonah
     * @author Skye
     */
    public static void welcome() {
        Scanner in = new Scanner(System.in);
        double Euro = 0.86;
        double Yuan = 7.13;
        double yourMoney = 0;
        double returnMoney = 0;
        System.out.println("Choose one of the following options: ");
        System.out.println("(1) Convert from USD to Euro");
        System.out.println("(2) Convert from Euro to USD");
        System.out.println("(3) Convert from USD to Yuan");
        System.out.println("(4) Convert from Yuan to USD");
        System.out.println("Option: ");
        int option = 0;
        do {
            if (!in.hasNextInt()) {
                String word = in.next();
                // System.err.println(word + " is not a number");
            } else {
                option = in.nextInt();
            }
            switch (option) {
                case 1:
                    System.out.println("Enter amount of USD to convert: ");
                    yourMoney = in.nextDouble();
                    returnMoney = convertUSDtoEuro(yourMoney, Euro);
                    System.out.printf("Amount of Euros is: $%.2f\n", returnMoney);
                    break;

                case 2:
                    System.out.println("Enter amount of Euro to convert: ");
                    yourMoney = in.nextDouble();
                    returnMoney = convertEurotoUSD(yourMoney, Euro);
                    System.out.printf("Amount of USD is: $%.2f\n", returnMoney);
                    break;
                case 3:
                    System.out.println("Enter amount of USD to convert: ");
                    yourMoney = in.nextDouble();
                    returnMoney = convertUSDtoYuan(yourMoney, Yuan);
                    System.out.printf("Amount of Yuan is: $%.2f\n", returnMoney);
                    break;

                case 4:
                    System.out.println("Enter amount of Yuan to convert: ");
                    yourMoney = in.nextDouble();
                    returnMoney = convertYuantoUSD(yourMoney, Yuan);
                    System.out.printf("Amount of USD is: $%.2f\n", returnMoney);
                    break;
                default:
                    System.out.println("Invalid option try again...");
                    option = 0;
                    break;
            }
        } while (option < 1);
        in.close();
    }

    /**
     * Converts USD to Euros
     * 
     * @author Jonah
     * @param USD and Euro converison
     * @return amount of Euros
     */
    public static double convertUSDtoEuro(double value, double Currency) {
        return (value * Currency);
    }

    /**
     * Converts Euros to USD
     * 
     * @author Jonah
     * @param Euros and Euro converison
     * @return amount of USD
     */
    public static double convertEurotoUSD(double value, double Currency) {
        return (value / Currency);
    }

    /**
     * Converts USD to Yuan
     * 
     * @author Skye
     * @param amount of USD and Yuan converison
     * @return amount of Yuan
     */
    public static double convertUSDtoYuan(double value, double Currency) {
        return (value * Currency);
    }

    /**
     * Converts Yuan to USD
     * 
     * @author Skye
     * @param amount of Yuan and Yuan converison
     * @return amount of USD
     */
    public static double convertYuantoUSD(double value, double Currency) {
        return (value / Currency);
    }

    /**
     * This is the main method
     */
    public static void main(String[] args) {
        welcome(); // method call
    }
}