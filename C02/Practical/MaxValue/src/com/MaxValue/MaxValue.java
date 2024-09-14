package com.MaxValue;
import java.util.*;

public class MaxValue {
	public static void main(String args[]) {
		Set<Integer> numbers= new HashSet<>();
		numbers.add(10);
		numbers.add(25);
		numbers.add(7);
		numbers.add(30);
		numbers.add(15);
		
		Integer maxValue= Collections.max(numbers);
		System.out.println("Max Value: "+maxValue);
	}
}
