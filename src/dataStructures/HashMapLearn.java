package dataStructures;

//from Angie's technical interview for automation testers

import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {
    public static void printDuplicates(char a[], char b[]){
        Map aMap = new HashMap<Character, Integer>();

        for (int i=0; i<a.length; i++){
            if(!aMap.containsKey(a[i])){
                aMap.put(a[i], 1);
            } else {
                aMap.put(a[i], (Integer)aMap.get(a[i]) + 1);
            }
        }

        for (int i = 0; i<b.length; i++){
            if(aMap.containsKey(b[i])){
                System.out.println(b[i]);
                if((Integer)aMap.get(b[i])==1){
                    aMap.remove(b[i]);
                } else {
                    aMap.put(b[i], (Integer)aMap.get(b[i]) -1);
                }
            }
        }
    }
    public static void main(String[] args){
        char[] a1 = {'c', 'a', 'b', 'c'};
        char[] b1 = {'b', 'c', 'd'};
        printDuplicates(a1, b1);
    }
}
