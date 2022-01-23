package algorithmsLearning;

// this code is adapted from 'grokking algorithms book' learning
import java.util.Arrays;

public class BinarySearch {
    private static Integer binarySearch(int[] list, int item) {
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
        int[] myList = {1, 3, 5, 7, 9};
        int[] myList2 = {9, 3, 7, 5, 1};

        // if a list is not sorted, sort it first:
        Arrays.sort(myList2);

        System.out.println("Found 1 at array location: " + (binarySearch(myList, 1))); // 1
        System.out.println("Found -1 at array location: " + (binarySearch(myList, -1))); // null
        System.out.println("Found 9 at array location: " + (binarySearch(myList2, 9)));
    }
}
