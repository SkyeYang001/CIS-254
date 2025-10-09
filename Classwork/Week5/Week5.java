public class Week5 {
    public static void main(String[] args) {

        printH();
    }

    /** This method prints a letter of the alphabet using the character
        passed as a parameter
        @param c the character used to print the letter
    */
    static void printH() {
        int inch = 100;
        double cm = inch * 100;
        System.out.printf("%d in = %.2f cm\n", inch, cm);
    }
}