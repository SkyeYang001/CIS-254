/**
   Homework 4
   Description: User inputs a name and birth year then the programs prints out hello refering the inputted name and age
   @author Skye Yang
   @since 9/4/2025
*/

import java.util.Calendar;
import java.util.Scanner; 

public class Main {
      public static void main(String args[]) {
         Scanner input = new Scanner(System.in);

         Calendar currentDate = Calendar.getInstance();
         int currentYear = currentDate.get(Calendar.YEAR);

         String name;
         int birthYear;
         int age;

         System.out.println("What is your name? ");
         name = input.nextLine();
         
         System.out.println("What year where you born? ");
         birthYear = input.nextInt();

         age = currentYear - birthYear;

         System.out.printf("Hello, %s! You are approximately %d years old.\n", name, age);
         input.close();

      }
}