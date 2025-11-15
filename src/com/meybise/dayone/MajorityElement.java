package com.meybise.dayone;

/*
 * 
 * Find the majority element in the array. A majority 
 * element in an array A[] of size n is an element that
 *  appears more than n/2 times (and hence there is at most one such element).
 *  Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
Explanation: There is no element whose frequency is greater than the half of the size of the array size. 
 */
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] nums = {1, 1, 3, 1, 1, 2, 1,7}; // Input array
	        Integer majorityElement = findMajorityElement(nums);
	        if (majorityElement != null) {
	            System.out.println("Majority Element: " + majorityElement);
	        } else {
	            System.out.println("No majority element found.");
	        }

	}
	
	 public static Integer findMajorityElement(int[] nums) {
	        // Step 1: Find a candidate for the majority element
	        Integer candidate = null;
	        int count = 0;

	        for (int num : nums) {
	            if (count == 0) {
	                candidate = num;
	            }
	            count += (num == candidate) ? 1 : -1;
	        }

	        // Step 2: Verify the candidate
	        count = 0;
	        for (int num : nums) {
	            if (num == candidate) {
	                count++;
	            }
	        }

	        // Check if the candidate is indeed the majority element
	        if (count > nums.length / 2) {
	            return candidate;
	        } else {
	            return null; // No majority element
	        }
	    }
}
