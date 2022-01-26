package StringsLearning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Consider a string "Hello Good Morning"
// it should print the sentence in reverse order output should be "Morning Good Hello"

public class ReverseAString {
    public static void main(String[] args){
        String[] str1 = {"Hello", "Good", "Morning", "Computer", "User"};

        reversePlace(str1);
        useArrayList(str1);
    }

    public static void useArrayList(String[] stringHere2){
        //use an array list
        System.out.println(Arrays.toString(stringHere2)); //converting array to string for printing on single line
        List<String> newStr2 = Arrays.asList(stringHere2); //converting array to list
        Collections.reverse(newStr2); //using the reverse method on list
        //String[] reversed = newStr2.toArray(stringHere2); //A. converting list to array
        //System.out.println(Arrays.toString(reversed)); //B. converting array to string for printing on single line
        System.out.println(newStr2); //this works too instead of A and B together
    }

    public static void reversePlace(String[] stringHere){
        int len1 = stringHere.length;
        String[] newStr1 = new String[len1];

        // Reverse array in place
        int j = len1 - 1;
        for (int i=0; i<len1; i++){
            newStr1[i] = stringHere[j];
            j--;
            System.out.print(newStr1[i] + " ");
        }
        System.out.print("\n");
    }
}
