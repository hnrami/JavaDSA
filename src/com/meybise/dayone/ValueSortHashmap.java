package com.meybise.dayone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
// Hash map KEYS value need to sort
public class ValueSortHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> hashmap = new HashMap<>();

		hashmap.put("X", 14);
		hashmap.put("A", 4);
		hashmap.put("V", 7);
		hashmap.put("P", 8);
		hashmap.put("L", 2);
		hashmap.put("G", 5);
		hashmap.put("E", 14);
		hashmap.put("S", 22);
		hashmap.put("T", 6);
		List<Integer> integerList = new ArrayList<>();

		for (Entry<String, Integer> entry : hashmap.entrySet()) {

			integerList.add(entry.getValue());

		}

		// Method 1
		 integerList.sort(Integer::compareTo);

		// Method 2
		// Collections.sort(integerList);

		// Method 3
		// Sort the list in descending order using Collections.sort with a lambda
		// expression
		//Collections.sort(integerList, (a, b) -> a - b);
		
		// Method 4
		// Sort the list in descending order using List.sort with a lambda expression
        // integerList.sort((a, b) -> a - b); // small to big number 
        // integerList.sort((a, b) -> b - a); // big to small number
		
		

		System.out.println("Ascending Order (using List.sort): " + integerList);
	}

}
