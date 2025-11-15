package com.meybise.array;

import java.util.Arrays;
import java.util.HashSet;

public class NonRepatingNumber {

	public static void main(String[] args) {
		
		
		int[] input= {1,44,55,22,11,44,55,33,55,33,45,67,44};
		int[] duplicateNumber = new int[input.length];
		HashSet<Integer> inpuHashSet = new HashSet<>();
		int index=0;
		for(int i=0;i<input.length-1;i++) {
			if(!inpuHashSet.contains(input[i])) {
				inpuHashSet.add(input[i]);
			}
			
		}
		
		System.out.println(inpuHashSet.toString());

	}

}
