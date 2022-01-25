package algorithmsLearning;

//Problem-Solving: Find the first occurrence of a given number from the series which has the
// difference between the adjacent elements as 1. For Example {1,0,-1,-2,-1,0,1,2,3}
// Note: Do not use Linear Search

import java.util.Arrays;

public class SearchOccurrence {
    private static Integer binarySearch2(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] myList3 = {1,0,-1,-2,-1,0,1,2,3};

        Arrays.sort(myList3);
        System.out.println("Found 2 at array location: " + (binarySearch2(myList3, 2)));
        System.out.println("Found -1 at array location: " + (binarySearch2(myList3, -1)));
        System.out.println("Found 9 at array location: " + (binarySearch2(myList3, 9)));
    }
}
