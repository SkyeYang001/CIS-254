/**
   Homework 5
   Description: The user inputs the first letter of their first and last name on the terminal as a character, then prints out the letter "S" and "Y" using the inputted character
   @author Skye Yang
   @since 9/9/2025
*/

public class Main {
    public static void main(String[] args) {

        printFirstLetter(args[0], args[1]);
    }

    /** This method prints two letters of the alphabet specifically "S" and "Y" using the character
        passed as a parameter
        @param letter1 the character used to print the letter of "S"
        @param letter2 the character used to print the letter of "Y"
    */
    static void printFirstLetter(String letter1, String letter2) {
            System.out.println(" " + letter1 + letter1 + letter1 + letter1 + "  " + letter2 + "   " + letter2);
            // System.out.println();
            System.out.println(letter1 + "    " + letter1 + " " + letter2 + "   " + letter2);
            System.out.println(letter1 + "      " + letter2 + "   " + letter2);
            System.out.println(" " + letter1 + letter1 + letter1 + letter1 + "   " + letter2 + letter2 + letter2);
            System.out.println("     " + letter1 + "   " + letter2);
            System.out.println(letter1 + "    " + letter1 + "   " + letter2);
            System.out.println(" " + letter1 + letter1 + letter1 + letter1 + "    " + letter2);
        }
    
}

    
