package com.meybise.dayone;

import java.util.Arrays;

/*
 * 
 * Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
 */
public class SqureOfInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {-4,-1,0,3,10};
		System.out.println("result Array after sort "+Arrays.toString(squreOfsort(input)));	
		

	}
	
	
	public static int[] squreOfsort(int []inputs) {
		System.out.println("input Arrays "+Arrays.toString(inputs));
		
		
		for(int i=0;i<inputs.length-1;i++) {
			
			int square=inputs[i]*inputs[i];
			inputs[i]=square;
		}
		System.out.println("After Square"+Arrays.toString(inputs));
				 Arrays.sort(inputs);
				 
				 
		return inputs;		 
	}

}
