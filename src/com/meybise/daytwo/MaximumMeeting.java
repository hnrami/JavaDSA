package com.meybise.daytwo;

import java.util.ArrayList;
import java.util.List;

public class MaximumMeeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] start = new int[] {1, 3, 0, 5, 8, 5};
		
		int[] end = new int[] {2, 4, 6, 7, 9, 9};
		
	}
	
	
	
	
	
	
/*	case-1
	start = [1, 3, 0, 5, 8, 5]
			end   = [2, 4, 6, 7, 9, 9]
*/

	
	
	
	
public static void caseone(int start[], int end[]) {

	//(1,2) (3,4) (0,6) (5,7) (8,9) (5,9)
	
	//(1,2) (3,4) (5,7) (8,9) (0,6) (5,9)

	ArrayList<Integer> startList = new ArrayList<>();
	ArrayList<Integer> endList = new ArrayList<>();
	int meeting = 0;
	for (int i = 0; i <= start.length; i++) {

		if (end[i] > start[i]) {

			startList.add(start[i]);
			endList.add(end[i]);
			meeting++;

		}
		

	}
}
}
