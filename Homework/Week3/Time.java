/**
   Homework 3
   Description: User inputs hours, minutes, and seconds for the program to displays relevant seconds of the day
   @author Skye Yang
   @since 8/26/2025
*/
public class Time {
    public static void main(String args[]) {
        int hour = Integer.valueOf(args[0]);
        int minute = Integer.valueOf(args[1]);
        int second = Integer.valueOf(args[2]);
        int totalSecondsInDay = 86400;
        int totalSeconds = (hour * 3600) + (minute * 60) + second;
        
        System.out.print("Number of seconds in a day: ");
        System.out.println(totalSecondsInDay);
        System.out.print("Seconds since midnight: ");
        System.out.println(totalSeconds);
        System.out.print("Seconds remaining in a day: ");
        System.out.println(totalSecondsInDay - totalSeconds);
        System.out.print("Percentage of the day that has passed: ");
        // System.out.println("%.0f%n", (Float.valueOf(totalSeconds)/Float.valueOf(totalSecondsInDay)) * 100 + "%");
        System.out.println((totalSeconds * 100 )/(totalSecondsInDay)+ "%");
    }
}
