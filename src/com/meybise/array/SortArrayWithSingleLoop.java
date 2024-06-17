package com.meybise.array;

public class SortArrayWithSingleLoop {
	    public static void main(String[] args) {
	        int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        
	        // Print the original array
	        System.out.println("Original array:");
	        printArray(arr);
	        
	        // Perform single-loop selection sort
	        singleLoopSelectionSort(arr);
	        
	        // Print the sorted array
	        System.out.println("Sorted array:");
	        printArray(arr);
	    }
	    
	    // Function to print an array
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	    
	    // Function to perform selection sort with a single loop
	    public static void singleLoopSelectionSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            int minIndex = i;
	            
	            // Find the minimum element in the unsorted portion of the array
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            
	            // Swap the found minimum element with the first element of the unsorted portion
	            if (minIndex != i) {
	                int temp = arr[minIndex];
	                arr[minIndex] = arr[i];
	                arr[i] = temp;
	            }
	        }
	    }
	}


