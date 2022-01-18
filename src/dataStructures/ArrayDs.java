package dataStructures;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class ArrayDs {
    private static String books[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("How many books would you like to enter?");
        books = new String[scanner.nextInt()];
        for (int i=0; i < books.length; i++){
            System.out.println("Give a book name: ");
            books[i] = scanner.next();
        }
        System.out.print("These are your books: ");
        for (int i=0; i < books.length; i++){
            System.out.print(" " + books[i]);
        }
        sort(books, 0, books.length);
        System.out.print("\nThese are your books sorted: ");
        for (int i=0; i < books.length; i++){
            System.out.print(" " + books[i]);
        }
    }
}
