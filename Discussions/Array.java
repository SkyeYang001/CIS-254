package Discussions;

import java.util.Scanner;
import java.util.Random;

/*
* 1. Write a method to count how many values in an int array are smaller than some target value.
*/

public class Array {

    public static void main(String args[]) {

        // int[] a = { 1, 2, 3, 4 };
        // int[] a = inRange(0, 100);
        // int length = list.length();
        // System.out.print("{" + a[0]);
        // for (int i = 1; i < a.length; i++) {
        //     System.out.print(", " + a[i]);
        // }
        // System.out.println("}");

        // int length = random.nextInt(1, 10);
        // System.out.println(counts[i]);

        // Random random = new Random();
        // counts[i] = random.nextInt(25);

        // 1. Write a method to count how many values in an int array are smaller than some target value.

        int length = 10;
        int[] counts = new int[length];
        for (int i = 0; i < length; i++) {
            counts[i] = i + 1;
        }
        
        int amount = 0;
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        for (int i = 0; i < length; i++) {
            if (value < counts[i]) {
                amount ++;
            }
        }
        System.out.println(amount);
    }

}
