package dataStructuresLearning;

// Check two strings are anagram: try - "astronomer" and "moon starer"
// For hp fans: "Tom Marvolo Riddle" and "I am Lord Voldemort"

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word 1: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter word 2: ");
        String str2 = scanner.nextLine();

        // remove spaces
        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");

        // avoid he who must not be named problems - aka capitalization issues
        str1 = str1.toLowerCase(Locale.ROOT);
        str2 = str2.toLowerCase(Locale.ROOT);

        if (str1.length() == str2.length()){
            char[] word1 = str1.toCharArray();
            char[] word2 = str2.toCharArray();
            checkAnagram(word1, word2);
        } else {
            System.out.println("The words need to be of equal length.");
        }
    }
    public static void checkAnagram(char[] a, char[] b){
        Map aMap = new HashMap<Character, Integer>();
        Map bMap = new HashMap<Character, Integer>();

        for (int i=0; i<a.length; i++){
            aMap.put(i, a[i]);
        }
        for (int i=0; i<a.length; i++){
            bMap.put(i, b[i]);
        }

        for (int i=0; i<a.length; i++){
            if (bMap.containsValue(aMap.get(i))) {
                bMap.values().remove(aMap.get(i));
                aMap.remove(i);
            }
        }

        if(aMap.isEmpty()){
            System.out.println("The words are anagrams.");
        } else {
            System.out.println("The words are not anagrams.");
        }
    }
}
