package com.meybise.array;

import java.util.HashMap;
import java.util.Map;

/*
 * Input: nums = [2,7,11,15], target = 9
Output: [0,1]
 */
public class TwoSum {

	public static void main(String[] args) {

		int num[]= {3,6,3};
		int target=6;
		int result[] = twoSum(num, target);
		  System.out.println("result: " + result[0] + ", " + result[1]); // Output: [0, 1]
	}
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
