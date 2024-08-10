package com.meybise.dayone;

public class TwoSum {

	/*
	 * 
	 * 
	 
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int inputValues[]= {2,7,11,15,5,6,4,6,7,8,5,3,};
		int target= 40;
		
		if(target ==0 || target <0) {
			System.out.println("NO");
		}
		for(int i=0;i<inputValues.length-1;i++) {
			 
			  int sum = inputValues[i] + inputValues[i+1];
			  if(sum == target) {
				  System.out.println("["+inputValues[i]+","+inputValues[i+1]+"]");
				  
				  System.out.println("["+i+","+(i+1)+"]");
				  i=inputValues.length;
			  }
			  
		}
		
		
	}

}
