package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Input a number corresponding to a day of the week: ");
        int day = scanner.nextInt();
        if (day>0 && day<8){
            System.out.println("The day is " + daysOfWeek[day - 1]);
        } else {
            System.out.println("That is not a valid day of the week.");
        }
    }

}
