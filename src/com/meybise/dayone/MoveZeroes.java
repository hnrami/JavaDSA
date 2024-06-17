package com.meybise.dayone;

import java.util.Arrays;

/*
 * Move all zeroes to end of array
 * Given an array of random numbers, Push all the zero’s of a given array 
 * to the end of the array. For example, 
 * if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, 
 * it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
 * 
 * 
 * 
 * 
 * 
 *Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0}; 
 * 
 * 
 * 
 * 
 * 
 */

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 1, 0, 1, 9, 0, 8, 0 };
		System.out.println("Original array: " + Arrays.toString(input));
//		methodOne(input);

		methodtwo(input);
		// methodthree(input);
		System.out.println("Array after moving zeroes to end: " + Arrays.toString(input));
	}

	public static void methodOne(int[] nums) {

		int nonZeroIndex = 0;

		// Traverse the array and move all non-zero elements to the front
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				nums[nonZeroIndex] = nums[i];
				nonZeroIndex++;
			}

		}
		// Fill the remaining positions with zeroes
		for (int i = nonZeroIndex; i < nums.length; i++) {
			nums[i] = 0;
		}

	}

	public static void methodtwo(int[] nums) {

		int nonZeroIndex = 0;

		// Single loop to move non-zero elements to the front and zeroes to the end
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				// Swap elements only if current element is non-zero

				int temp = nums[nonZeroIndex];
				nums[nonZeroIndex] = nums[i];
				nums[i] = temp;
				nonZeroIndex++;
			}

		}

	}

	public static void methodthree(int[] nums) {

		int nonZeroIndex = 0;

		// Single loop to move non-zero elements to the front and zeroes to the end
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				if (i != nonZeroIndex) {
					// Swap only when the current element is not in its intended position
					int temp = nums[nonZeroIndex];
					nums[nonZeroIndex] = nums[i];
					nums[i] = temp;
				}
				nonZeroIndex++;
			}
		}

	}

}
