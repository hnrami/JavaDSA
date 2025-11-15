package com.meybise.basic;

import java.util.Arrays;
import java.util.Comparator;

public class SampleProgram {
	
	/*
	 * Given a string of words,
 the task is to sort them in descending order based on their lengths. 
Input : "i am a java developer from bangalore"
	 */

	public static void main(String[] args) {

		
		// sort descending 
		
		String input="i am a java developer from bangalore";
		
		 // Split the input string into words
        String[] words = input.split(" ");
        
       
        Arrays.sort(words);
        // Sort the words by length in descending order
//        Arrays.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String w1, String w2) {
//                // Compare by length in descending order
//                return Integer.compare(w2.length(), w1.length());
//            }
//        });
        
        // Join the sorted words into a single string
        String result = String.join(" ", words);
        
        // Output the result
        System.out.println(result);
        
        
        
		
		//spill the words 
		String spiltResult[] = input.split(" ");
		
		System.out.println(spiltResult.length);
		
		
//		HashMap<String, Integer> spiltmap = new HashMap<>();
//		
//		for(String spilt : spiltResult) {
//			
//		spiltmap.put(spilt, spilt.toCharArray().length);
//			
//		}
		
//		
//		for(int i=0;i<spiltResult.length-1;i++) {
//			
//			for(int j=1;j<spiltResult.length-1;j++) {
//				
//				
//				 
//				 if(spiltResult[j].length() > spiltResult[i].length()) {
//					 
//					 String temp =spiltResult[j];
//					 spiltResult[j]=spiltResult[i];
//					 spiltResult[i]=temp;
//					 
//					 
//				 }
//				
//			}
//		}
//	
//		
//		for(String result : spiltResult) {
//			System.out.println(result);
//		}
//		
		
		
		
		
		    
		
	}

}
