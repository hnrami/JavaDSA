package com.meybise.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// #java # java8 
// Delete an element from an array.

public class RemoveElement {

	public static void main(String[] args) {
	
		
		 // Original array
        Integer[] originalArray = {1, 2, 3, 4, 5};

        // Convert array to ArrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(originalArray));

        // Element to remove
        Integer elementToRemove = 3;

        // Remove the element
        list.remove(elementToRemove);

        // Convert ArrayList back to array
        Integer[] newArray = list.toArray(new Integer[0]);

        // Print the new array
        System.out.println("New Array: " + Arrays.toString(newArray));
		
	}

}
