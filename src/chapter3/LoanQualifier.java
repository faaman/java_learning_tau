package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]){
        int min_salary = 30000;
        int min_tenure = 2;

        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How long have you been working at the current job? ");
        double tenure = scanner.nextDouble();

        if (salary >= min_salary){
            if (tenure >= min_tenure){
                System.out.println("Congratulations, you qualify for the loan!");
            } else System.out.println("Sorry, you do not qualify for the loan, as your tenure at job is short.");
        } else System.out.println("Sorry, you do not qualify for the loan, as your salary is less.");

        scanner.close();
    }
}
