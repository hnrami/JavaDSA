package com.meybise.array;

public class SearchInsertPostion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1};
		int target = 0;
		System.out.println(searchInsert(nums, target));
//		Input: nums = [1,3,5,6], target = 2
//				Output: 1
	}

	public static int searchInsert(int[] nums, int target) {
		
		 int left = 0;
	        int right = nums.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (nums[mid] == target) {
	                return mid; // Target found, return index
	            } else if (nums[mid] < target) {
	                left = mid + 1; // Target is in the right half
	            } else {
	                right = mid - 1; // Target is in the left half
	            }
	        }
	        
	        // If target is not found, left will be the insertion position
	        return left;
	}
}
