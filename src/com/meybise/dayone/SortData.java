package com.meybise.dayone;

public class SortData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1, 2, 12, 5, 1, 9};
		int[] selnums = {9, 2, 12, 5, 1, 3};
		bubbleSort(nums);
        System.out.println("Sorted array: " + java.util.Arrays.toString(nums));
        
        selectionSort(selnums);

        System.out.println("Sorted array-selectionSort: " + java.util.Arrays.toString(selnums));
	}
	
	
	
	
	public static void bubbleSort(int[] nums) {
		
		 int n = nums.length;
	        boolean swapped; // Declare the swapped variable
	        // Repeat the process until no swaps are needed
	        do {
	            swapped = false; // Initialize swapped to false at the start of each pass
	            for (int i = 1; i < n; i++) {
	                // Compare adjacent elements and swap if necessary
	                if (nums[i - 1] > nums[i]) {
	                    int temp = nums[i - 1];
	                    nums[i - 1] = nums[i];
	                    nums[i] = temp;
	                    swapped = true; // Set flag to true if a swap occurs
	                }
	            }
	            // Reduce the range for the next pass (last element is sorted)
	            n--;
	        } while (swapped); // Continue if a swap occurred in the last pass
		
		
	}
	
	
	  public static void selectionSort(int[] nums) {
	        int n = nums.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (nums[j] < nums[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            // Swap the found minimum element with the first element
	            int temp = nums[minIndex];
	            nums[minIndex] = nums[i];
	            nums[i] = temp;
	        }
	    }

}
