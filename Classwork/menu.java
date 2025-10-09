import java.util.Scanner;

public class menu {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        while (option < 1) {
            option = menu(input);
            // System.out.println(option);
            switch (option) {
                // case 0:

                // break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                default:
                    System.out.println("Quitting program...");
            }
        }
        input.close();
    }

    public static int menu(Scanner input) {
        int value = 0;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Enter a value relating to the option you want to choose.");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("Any number quits the program.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (value < 1) {
            System.out.println("Please enter a value.");
            if (!input.hasNextInt()) {
                String word = input.next();
                System.err.println(word + " is not a number");
                value = 0;
            } else {
                value = input.nextInt();
            }

        }
        return value;
    }
}   
