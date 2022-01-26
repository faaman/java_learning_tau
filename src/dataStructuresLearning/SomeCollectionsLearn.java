package dataStructuresLearning;

// from tau java course

import java.util.*;

public class SomeCollectionsLearn {
    public static void main(String[] args){
        runSet();
        runList();
        runQueue();
    }
    public static void runSet(){
        Set fruit = new HashSet();
        fruit.add("mango");
        fruit.add("grapes");
        fruit.add("mango");
        System.out.println(fruit.size());
        System.out.println(fruit);
    }

    public static void runList(){
        List fruit = new ArrayList();
        fruit.add("orange");
        fruit.add("melon");
        fruit.add("orange");
        System.out.println(fruit);
        System.out.println(fruit.get(1));
    }

    public static void runQueue(){
        Queue fruit = new LinkedList();
        fruit.add("jaamun");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("melon");
        fruit.add("orange");
        System.out.println(fruit);
        fruit.remove();
        System.out.println(fruit);
        System.out.println(fruit.peek());
        fruit.remove();
        System.out.println(fruit);
    }
}
