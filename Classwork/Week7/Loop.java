package Classwork.Week7;

public class Loop {
    public static void main(String args[]) {
        int count = 0;
        while (count < 5) {
            System.out.println("Hello" + (count + 1));
            count++;
        }
        for (count = 1; count <=5; count++) {
            System.out.println("Goodbye" + (count));
        }
        for (count = 5; count >= 1; count--) {
            System.out.println("See you later" + (count));
        }
        for(int i = 1; i < 16; i = i * 2) {
            System.out.println("Echo " + i);
        }
        System.out.println("Done!");
        for(int i = 0; i > 10; i++) {
            System.out.println("Java " + i);
        }
        
    }
}
