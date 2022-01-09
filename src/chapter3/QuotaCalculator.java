package chapter3;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){
        int payment = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("Enter the number of sales the salesperson made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) {
            System.out.println("Congratulations, you have made marvelous sales this week!");
            payment = payment + bonus;
        } else
            System.out.println("Your sales number fell short of " + (quota - sales) + " this week, try better next time.");

        System.out.println("Your payment this week is $" + payment);
    }
}
