import java.util.Scanner;

/**
* 10 . A for loop that calculates the factorial of a given number. Example: factorial of 10 = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
* @author Skye Yang
*/
public class Loop {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number:");
        int factorial = input.nextInt();
        for(int i = factorial; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        input.close();
    }
}

