package com.meybise.dayone;

public class Zigzag {

	public static void main(String[] args) {
		
		
		/*
		 * Input: s = "PAYPALISHIRING", numRows = 3
		   Output: "PAHNAPLSIIGYIR"
		 */

		
		String input="PAYPALISHIRING"; int numRows = 3;
	   
		char[] value=input.toCharArray();
		int size=value.length;
		char[] output = new char[size];
		int k=0;
		for(int i=0;i<size-1;i++) {
			
			for(int j=i;j<size-1;j++) {
				
				output[k]=value[j];
				j=j+numRows;
				k=k+1;
			}
			numRows=numRows-1;
		}
		
		
		
	}

}
