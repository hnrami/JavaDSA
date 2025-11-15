package com.meybise.daytwo;

public class PivotIndex {

	public static void main(String[] args) {
		
		 int[] nums = {4, 6, 0, 6, 5, 8};
	        int pivotIndex = findPivotIndex(nums);
	        System.out.println("Pivot Index: " + pivotIndex);

	}
	
	  public static int findPivotIndex(int[] nums) {
	        // Edge case: if the array is empty, there's no pivot index
	        if (nums == null || nums.length == 0) {
	            return -1;
	        }

	        int totalSum = 0;
	        int leftSum = 0;

	        // First, calculate the total sum of the array
	        for (int num : nums) {
	            totalSum += num;
	        }

	        // Iterate through the array to find the pivot index
	        for (int i = 0; i < nums.length; i++) {
	            // Calculate the right sum for the current index
	            // rightSum = totalSum - leftSum - nums[i]
	            int rightSum = totalSum - leftSum - nums[i];

	            // Check if leftSum equals rightSum
	            if (leftSum == rightSum) {
	                return i; // Found the pivot index
	            }

	            // Update leftSum for the next iteration
	            leftSum += nums[i];
	        }

	        // If no pivot index is found, return -1
	        return -1;
	    }

}
