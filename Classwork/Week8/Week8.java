package Classwork.Week8;

import java.util.Scanner;

public class Week8 {
    public static void main(String args[]) {
        String input = "The quick brown fox jumps over the lazy dog.";
        Boolean result = isPangram(input);
        System.out.println(result);
    }

    public static boolean isPangram(String input) {
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
        // for(char i = 'a'; i <= 'z'; i++) {
        // if (!input.contains(String.valueOf(i))) {
        // return false;
        // }
        // }
        // return true;
    }
}