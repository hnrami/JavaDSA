package com.meybise.array;

import java.util.HashSet;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int nums[] = {4,1,2,1,2,5};
			System.out.println(singleNumberother(nums));
	}
	
    public static int singleNumber(int[] nums) {
    	
    	 int result = 0;
         
         for (int num : nums) {
             result ^= num;
         }
         
         return result;
    }
    
    public static int singleNumberother(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        
        // After iteration, set should contain only the single number
        return set.iterator().next();
    }

}
