package com.FruitsSet;
import java.util.*;

public class FruitsSet {
	public static void main(String args[]) {
		Set<String> fruits = new HashSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
       
        List<String> fruitList = new ArrayList<>(fruits);

        Collections.sort(fruitList);

        System.out.println("Fruits in alphabetical order:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }
}
	

