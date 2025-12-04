import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Final Project
 * Description:
 * Magic 8 Ball game, where the user creates a list out of questions and
 * fortunes related to the question.
 * 
 * @author Skye Yang
 * @since 12/02/2025
 */

public class App {

    /**
     * This is the main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        int answer = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<MagicBallFortune> fortune = new ArrayList<MagicBallFortune>();
        ArrayList<MagicBallFortune> userList = new ArrayList<MagicBallFortune>();
        ArrayList<String> userQuestions = new ArrayList<String>();
        String question;
        Random random = new Random();
        createFortunes(fortune);
        do {
            answer = menu(input);
            switch (answer) {
                default:
                    break;
                case 1:
                    question = magicalBall(input, random, fortune, userList);
                    userQuestions.add(question);
                    break;
                case 2:
                    fortuneList(fortune);
                    break;
                case 3:
                    userRecords(userList, userQuestions);
                    break;
                case 0:
                    input.close();
                    System.out.println("Good Bye!");
                    return;
            }
        } while (true);

    }

    /**
     * This method is the menu where the user inputs a number that opens a method
     * corresponding to the option
     * 
     * @param input
     * @return
     */
    public static int menu(Scanner input) {
        int value = -1;
        while (value == -1) {
            System.out.println("1. Shake the Magic 8 Ball.");
            System.out.println("2. View fortunes.");
            System.out.println("3. View your list of fortunes.");
            System.out.println("0. Exit.");
            System.out.println("Pick to view an option.");
            try {
                value = input.nextInt();
                if (value < 0 || value > 3) {
                    System.out.println("\nPlease enter a number between 0 and 3.\n");
                    value = -1;
                }
            } catch (InputMismatchException e) {
                String bad = input.next();
                System.err.println("\n" + bad + " is not a number.\n");
                value = -1;
            }
        }
        return value;
    }

    /**
     * This method creates all of the fortunes using the MagicBallFortune class
     * 
     * @param fortune
     */
    public static void createFortunes(ArrayList<MagicBallFortune> fortune) {
        // Affirmative (P)
        fortune.add(new MagicBallFortune("It is certain", 'P'));
        fortune.add(new MagicBallFortune("It is decidedly so", 'P'));
        fortune.add(new MagicBallFortune("Without a doubt", 'P'));
        fortune.add(new MagicBallFortune("Yes definitely", 'P'));
        fortune.add(new MagicBallFortune("You may rely on it", 'P'));
        fortune.add(new MagicBallFortune("As I see it, yes", 'P'));
        fortune.add(new MagicBallFortune("Most likely", 'P'));
        fortune.add(new MagicBallFortune("Outlook good", 'P'));
        fortune.add(new MagicBallFortune("Yes", 'P'));
        fortune.add(new MagicBallFortune("Signs point to yes", 'P'));

        // Non–Committal (C)
        fortune.add(new MagicBallFortune("Reply hazy, try again", 'C'));
        fortune.add(new MagicBallFortune("Ask again later", 'C'));
        fortune.add(new MagicBallFortune("Better not tell you now", 'C'));
        fortune.add(new MagicBallFortune("Cannot predict now", 'C'));
        fortune.add(new MagicBallFortune("Concentrate and ask again", 'C'));

        // Negative (N)
        fortune.add(new MagicBallFortune("Don't count on it", 'N'));
        fortune.add(new MagicBallFortune("My reply is no", 'N'));
        fortune.add(new MagicBallFortune("My sources say no", 'N'));
        fortune.add(new MagicBallFortune("Outlook not so good", 'N'));
        fortune.add(new MagicBallFortune("Very doubtful", 'N'));
    }

    /**
     * This method lets the user creates/add their fortune and question array list
     * 
     * @param input
     * @param random
     * @param fortune
     * @param userList
     * @return question
     */
    public static String magicalBall(Scanner input, Random random, ArrayList<MagicBallFortune> fortune,
            ArrayList<MagicBallFortune> userList) {
        input.nextLine();
        System.out.println("----------------------------------------------------------------------------------\n");
        System.out.printf("Fortune %d\n", userList.size() + 1);
        System.out.printf("Question: ");
        String question = input.nextLine();
        System.out.println();
        System.out.println("Shaking...\n");
        int output = random.nextInt(fortune.size());
        userList.add(new MagicBallFortune((fortune.get(output).getFortune()), (fortune.get(output).getType())));
        System.out.printf((fortune.get(output).getFortune()) + "\n");
        System.out.println("\n----------------------------------------------------------------------------------");
        return question;
    }

    /**
     * This method prints of the fortunes for the user to view
     * 
     * @param fortune
     */
    public static void fortuneList(ArrayList<MagicBallFortune> fortune) {
        System.out.println("----------------------------------------------------------------------------------\n");
        System.out.println("Fortunes List:");
        for (int i = 0; i < fortune.size(); i++) {
            System.out.println("• " + fortune.get(i));
        }
        System.out.println("\n----------------------------------------------------------------------------------");
    }

    /**
     * This method prints out the user's list using the question and fortune list
     * 
     * @param userList
     * @param userQuestions
     */
    public static void userRecords(ArrayList<MagicBallFortune> userList, ArrayList<String> userQuestions) {
        System.out.println("----------------------------------------------------------------------------------\n");
        String type;
        if (userList.size() == 0) {
            System.out.println("Your list hasn't been created yet. Shake the ball to create your list.");
        } else {
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getType() == 'P') {
                    type = "Affirmative";
                } else if (userList.get(i).getType() == 'C') {
                    type = "Non-Committal";
                } else {
                    type = "Negative";
                }
                System.out.printf("%d. " + (userQuestions.get(i)) + ": " + (userList.get(i).getFortune()) + " | Type: "
                        + type + "\n", i + 1);
            }
        }
        System.out.println("\n----------------------------------------------------------------------------------");
    }
}
