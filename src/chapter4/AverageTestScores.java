package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int totalStudents = 2, totalTests = 4;
        double tempTotal = 0;

        for (int i = 0; i < totalStudents; i++){
            for (int j = 0; j < totalTests; j++){
                System.out.println("Enter student " + (i+1) + "'s score for Test " + (j+1));
                tempTotal = tempTotal + scanner.nextDouble();
            }
            System.out.println("Student " + (i+1) + " has an average test score of " + (tempTotal / totalTests));
            tempTotal = 0;
        }
        scanner.close();
    }
}
