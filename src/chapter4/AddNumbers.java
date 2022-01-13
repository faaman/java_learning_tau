package chapter4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    prompt the user to enter their first number
    then prompt them to enter the second number
    add those numbers up
    then ask them if they’d like to do another calculation
 */
public class AddNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        int no1, no2;

        do {
            System.out.println("Enter your first number: ");
            no1 = scanner.nextInt();
            System.out.println("Enter your second number: ");
            no2 = scanner.nextInt();
            System.out.println("The sum of both numbers is = " + (no1 + no2));
            System.out.println("Do you want to do another calculation? (True or False) ");

            try {
                again = scanner.nextBoolean();
            } catch (InputMismatchException e){
                System.out.println("You can only enter True or False values for doing another calculation.");
                break;
            }
        } while (again);

        scanner.close();
    }
}
