package chapter4;

import java.util.Scanner;

//while loop
public class GrossPayInputValidation {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross =  rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
