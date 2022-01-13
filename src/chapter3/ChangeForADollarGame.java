package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String args[]){
        int pennies, nickels, dimes, quarters;

        System.out.println("How many pennies?");
        Scanner scanner = new Scanner(System.in);
        pennies = scanner.nextInt();

        System.out.println("How many nickels?");
        nickels = scanner.nextInt();

        System.out.println("How many dimes?");
        dimes = scanner.nextInt();

        System.out.println("How many quarters?");
        quarters = scanner.nextInt();

        /*
    If it's exactly one dollar then they win the game.
    If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
    If it's less than one dollar, tell them how much they went under.
         */

        int pennies_total = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);

        if (pennies_total == 100){
            System.out.println("Congratulations, you have won the game!!!");
        } else if (pennies_total < 100){
            int temp = 100 - pennies_total;
            System.out.println("Sorry, you were " + temp + " pennies less than $1 to win this game.");
        } else if (pennies_total > 100){
            int temp = pennies_total - 100;
            System.out.println("Sorry, you were " + temp + " pennies more than $1 to win this game.");
        }
        scanner.close();
    }
}
