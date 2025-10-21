
/**
 * Mid Term: This program contains two list of numbers. The the first list is printed with it's median, average, and the amount of odd and even numbers. The second list is printed with it's Median.
 * @author Skye Yang
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.lang.Math;

public class Midterm_fall2025 {

    /**
     * The Main Method, prints out the two list with the first printed with it's
     * median, average, and amount of odd and even numbers. The second is printed
     * with it's median.
     */

    // Main method: DO NOT CHANGE

    public static void main(String[] args) {

        int[] numberSet = generateRandomNumbers(9);
        System.out.println("First set:");
        printAllNumbers(numberSet);
        System.out.printf("Median: %.2f\n", median(numberSet));
        System.out.printf("Average: %.2f\n", average(numberSet));
        System.out.printf("%d numbers are even\n", evens(numberSet));
        System.out.printf("%d numbers are odd\n", odds(numberSet));
        int[] numberSet2 = generateRandomNumbers(10);
        System.out.println("Second set:");
        printAllNumbers(numberSet2);
        System.out.printf("Median: %.2f\n", median(numberSet2));
    }

    /**
     * Creates the list of the two lists
     * 
     * @param size
     * @return numbers
     */

    private static int[] generateRandomNumbers(int size) {
        Random rnd = new Random();
        rnd.setSeed(9); // DO NOT change this line
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = Math.abs(rnd.nextInt()) % 100;
        }
        Arrays.sort(numbers);
        return numbers;
    }

    /**
     * Prints the list of numbers
     * 
     * @param numberSet
     */

    private static void printAllNumbers(int[] numberSet) {
        // Write code to print all numbers in the number set
        // ALL in one line separated by space
        int length = numberSet.length;
        System.out.print("{ ");
        for (int i = 0; i < length; i++) {
            System.out.print(numberSet[i] + " ");
        }
        System.out.println("}");

    }

    /**
     * Returns the amount of even numbers in the list.
     * 
     * @param numberSet
     * @return the amount of even numbers
     */

    private static int evens(int[] numberSet) {

        // Write code to determine and return how many numbers are even in the number
        // set

        int length = numberSet.length;
        int amount = 0;
        int equation;
        for (int i = 0; i < length; i++) {
            equation = numberSet[i] % 2;
            if (equation == 0) {
                amount++;
            }
        }

        return amount; // replace this line with the correct return statement
    }

    /**
     * Returns the amount of odd numbers in the list.
     * 
     * @param numberSet
     * @return the amount of odd numbers
     */

    private static int odds(int[] numberSet) {

        // Write code to determine and return how many numbers are odd in the number set

        int length = numberSet.length;
        int amount = 0;
        int equation;
        for (int i = 0; i < length; i++) {
            equation = numberSet[i] % 2;
            if (equation != 0) {
                amount++;
            }
        }

        return amount; // replace this line with the correct return statement

    }

    /**
     * Returns the average of the list.
     * 
     * @param numberSet
     * @return the average of the list
     */

    private static double average(int[] numberSet) {

        // Write code to compute the average of the numbers in the number set
        // Average is the sum divided by how many there are

        int length = numberSet.length;
        double sum = 0;
        double average;
        for (int i = 0; i < length; i++) {
            sum = numberSet[i] + sum;
        }
        average = sum / length;

        return average; // replace this line with the correct return statement

    }

    /**
     * Returns the median of the list.
     * 
     * @param numberSet
     * @return the median of the list
     */

    private static double median(int[] numberSet) {

        // Write code to compute the median of the numbers in the number set
        // Median is the number in the middle in an ordered number set
        // If there is an even number of elements, it's the avearge of the two
        // in the middle. Make sure your method works in both situations.

        int length = numberSet.length;
        int list = length % 2;
        double middle = 0;
        double median = 0;
        if (list == 0) {
            middle = (numberSet[(length / 2) - 1] + numberSet[(length / 2)]);
            median = middle / 2;
        } else {
            median = numberSet[length / 2];
        }

        return median; // replace this line with the correct return statement

    }
}
