package Classwork.Week6;

import java.util.Scanner;

public class Week6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int option = menu(input);
        System.out.printf("You entered option %i", option);
    }

    public static int menu(Scanner input) {
        System.out.println("Choose one of the following options: ");
        System.out.println("(1) Convert from Celsius to Fahrenheit");
        System.out.println("(2) Convert from Fahrenheit to Celsius");
        System.out.println("Option: ");
        int option = input.nextInt();
        return option;
    }
}
