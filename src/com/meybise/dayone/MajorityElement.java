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
		
		int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majorityElement = findMajorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);

	}
	
	  public static int findMajorityElement(int[] nums) {
	        int count = 0;
	        Integer candidate = null;

	        // Phase 1: Find a candidate
	        for (int num : nums) {
	            if (count == 0) {
	                candidate = num;
	            }
	            count += (num == candidate) ? 1 : -1;
	        }

	        // Phase 2: Verify the candidate (Optional)
	        count = 0;
	        for (int num : nums) {
	            if (num == candidate) {
	                count++;
	            }
	        }
	        
	        if (count > nums.length / 2) {
	            return candidate;
	        } else {
	            throw new IllegalArgumentException("No majority element found");
	        }
	    }

}
