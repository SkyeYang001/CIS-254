import java.util.Scanner;

/**
 * Partner Lab 2
 * Description: Use various string methods to check for the properties of an
 * inputted string.
 * 
 * @author Charlie Kavich (isPalindrome and isAbecedarian)
 * @author Skye Yang (isPangram and capitalizeFirstLetter)
 * @since Sep 30 2025
 */
public class Antics {

    /**
     * Description: Takes in an input and tells you if it is a palindrome or not
     * 
     * @param input The inputted string that is being checked whether or not it is a
     *              palindrome
     * @return A boolean representing whether or not the inputted string was a
     *         palindrome
     */

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();

        int length = input.length();
        int forward = 0;
        int backwards = length - 1;

        while (forward != backwards && forward < backwards) {
            if (input.charAt(forward) != input.charAt(backwards)) {
                return false;
            }

            forward++;
            backwards--;
        }
        return true;
    }

    /**
     * Description: Takes in an input and tells you if it is a Abecedarian or not
     * 
     * @param input The inputted string that is being checked whether or not it is a
     *              abecedarian
     * @return A boolean representing whether or not the inputted string was an
     *         abecedarian
     */
    public static boolean isAbecedarian(String input) {
        int length = input.length();
        input = input.toLowerCase();

        for (int i = 1; i < length; i++) {
            int posOne = input.charAt(i);
            int posTwo = input.charAt(i - 1);

            if (posOne < posTwo) {
                return false;
            }

        }
        return true;
    }

    /**
     * Description: Takes in an input and tells you if it is a pangram or not
     * 
     * @param input The inputted string that is being checked whether or not it is a
     *              pangram
     * @return A boolean representing whether or not the inputted string was a
     *         pangram
     */
    public static Boolean isPangram(String input) {
        input = input.toLowerCase();
        int length = input.length();
        Boolean letterIn;
        for (char i = 'a'; i <= 'z'; i++) {
            letterIn = false;
            for (int x = 0; x < length; x++) {
                if (i == input.charAt(x)) {
                    letterIn = true;
                    break;
                }
            }
            if (letterIn != true) {
                return false;
            }
        }
        return true;
    }

    /**
     * Description: Takes in an input and tells you if the first letter is
     * capitalize or not
     * 
     * @param input The inputted string is changed to have it's first letter being
     *              capitalized.
     * @return The inputted string with it's first letter capitalized.
     */
    public static String capitalizeFirstLetter(String input) {
        char first = Character.toUpperCase(input.charAt(0));
        return first + input.substring(1, input.length());
    }
}