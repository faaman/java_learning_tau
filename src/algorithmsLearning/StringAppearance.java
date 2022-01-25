package algorithmsLearning;

// given a list of Strings and a specific String, find how many times the String appears in the list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringAppearance {
    public static void printCount(List<String> l, String s){
        if(l != null){
            System.out.println(Collections.frequency(l, s));
        } else {
            System.out.println("The list is null");
        }
    }
    public static void main(String[] args){
        List l = new ArrayList();
        l.add("abc");
        l.add("def");
        l.add("abc");
        l.add("ghi");
        printCount(l, "abc");
    }
}
