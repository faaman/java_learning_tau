package dataStructuresLearning;

import java.util.HashMap;
import java.util.Map;

public class AnotherHashMap {
    public static void main(String[] args){
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("apple", 22);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("apple"));
        System.out.println(fruitCalories.entrySet());
        fruitCalories.remove("apple");
        System.out.println(fruitCalories);
    }
}
