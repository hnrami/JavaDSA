package com.meybise.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		
		
//		List<Integer> input = Arrays.asList(23,56,34,34,343,34,12,44);
//		input.stream().max(Integer::compare).get();
//		Set<Integer> inputset = new HashSet<>();
		
//		inputset= input.stream().filter(n -> !inputset.add(n)).collect(Collectors.toList());
		
////		
		
		int input[] = {1, 2, 3, 1, 1, 2, 7};
		
//		input.stream().filter(n -> !inputset.add(n)).collect null, n
//		System.out.println(inputset);
//		
//		for(int value : input) {
//			
//			
//		}
	
		int count=0;
		HashMap<Integer, Integer> numbers= new HashMap<>();
		for(int i=0;i<input.length;i++) {
			
			for(int j=i;j<input.length;j++) {
				
				if(input[j]==input[i]) {
					
				  count+=1;
				}
			}
			if(!numbers.containsKey(input[i]))
		     	numbers.put(input[i],count);
			count=0;
		}
//		
		
		System.out.println(numbers.toString());
		
		
//		  List<Integer> inputs = List.of(12, 45, 67,67, 34, 56, 78, 78, 78, 14, 15, 17);
//	        
//	        // Sets to track seen numbers and duplicates
//	        Set<Integer> seen = new HashSet<>();
//	        Set<Integer> duplicates = new HashSet<>();
//	        
//	        for (Integer number : inputs) {
//	            // If the number is already in the seen set, it's a duplicate
//	            if (!seen.add(number)) {
//	                duplicates.add(number);
//	            }
//	        }
//	        
//	        // Print the duplicates
//	        System.out.println("Duplicate numbers: " + duplicates);
		
		
		
		
		
	}

}
