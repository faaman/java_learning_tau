package dataStructures.chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args){
        setDemo();
        //listDemo();
        //queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println("\n loop through collections using iterator: ");
        var i = fruit.iterator();
        while(i.hasNext())
            System.out.print(i.next() + " ");

        System.out.println("\n use enhanced for loop: ");
        for(String item : fruit){
            System.out.print(item + " ");
        }

        System.out.println("\n use forEach method: ");
        fruit.forEach(x -> System.out.print(x + " "));

        System.out.println("\n syntactic sugar: ");
        fruit.forEach(System.out::println);
    }

    public static void mapDemo(){
        Map<String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println("\n Iterate over a map using enhanced for loop: ");
        for(var entry : fruitCalories.entrySet()){
            System.out.print(entry.getValue());
            System.out.print(entry.getKey());
            System.out.println(" ");
        }

        System.out.println("\n Iterate over a map using enhanced forEach: ");
        fruitCalories.forEach(
                (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));
    }

}
