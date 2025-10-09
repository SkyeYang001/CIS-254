package Classwork.Week9;

import java.util.Scanner;
// Skye Yang

public class Arrays {

    public static int search(int[] array, int target) {
        int foundIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int value = 0;
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        String answer;
        do {
            System.out.println("What number are you looking for? ");
            value = input.nextInt();

            int indexlocation = search(numbers, value);

            if (indexlocation == -1) {
                System.err.println("Location not found");
            } else {
                System.err.println("Index found at location " + indexlocation);
            }
            System.out.println("Do you want to keep searching? (Y/N)");
            answer = input.next();
        } while (answer.equalsIgnoreCase("Y"));
        System.out.println("Goodbye!");


        input.close();
    }
}
