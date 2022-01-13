package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items do you want to scan? ");
        int quantity = scanner.nextInt();
        double total = 0;

        for (int i = 0; i < quantity ; i++){
            System.out.println("Enter the cost of the item: ");
            total = scanner.nextDouble() + total;
        }

        System.out.println("Your total is $" + total);
        scanner.close();
    }
}
