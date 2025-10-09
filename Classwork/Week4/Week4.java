package Classwork.Week4;
import java.util.Scanner;
import java.util.Calendar; 
public class Week4 {
        public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String name;
        int birth;

        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);

        System.out.println("What is your name? ");
        name = input.nextLine();

        System.out.println("Nice to meet you, what year where you born? ");
        birth = input.nextInt();
        int age = currentYear - birth;

        System.out.println("Hello, " + name);
        System.out.printf("Looks like you are approximately, %d years old\n", age);
        
        input.nextLine();

        System.out.println("What is your favorite color");
        String color = input.nextLine();
        System.out.println("You also like the color " + color + ".");
        input.close();
    }
}