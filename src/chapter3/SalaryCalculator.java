package chapter3;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){
        int payment = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("Enter the number of sales the salesperson made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > quota) {
            payment = payment + bonus;
        }

        System.out.println("The salesperson's payment this week is $" + payment);
    }
}
