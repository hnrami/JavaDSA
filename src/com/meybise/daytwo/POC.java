package com.meybise.daytwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class POC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="red green white red blue white black";
		
		//Output : red, white
		
		String input[] = s.split(" ");
		
		 
		
		HashSet<String> resultSet = new HashSet<>();
		for(String result : input) {
			
			if(!resultSet.add(result)) {
				System.out.println(result);
			}
			
		}
		
		
		Stream<String> inputStream = Arrays.stream(input);
		
		inputStream.collect(Collectors.groupingBy(x -> x,Collectors.counting()))
		.entrySet().
		stream().
		filter(e -> e.getValue() >1)
		.collect(Collectors.toList());
		
		
		

	}

}
