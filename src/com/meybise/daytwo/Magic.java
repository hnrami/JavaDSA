package com.meybise.daytwo;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    
	      
	      int inputNumber = 163;
	        String inputValue = String.valueOf(inputNumber);
	        char[] input = inputValue.toCharArray();
	        int result = magic(input);

	        boolean output = true;

	        // Loop to reduce the number until a single digit is obtained
	        do {
	            System.out.println("Current result: " + result);

	            // Check if the result has more than 1 digit
	            if (String.valueOf(result).length() > 1) {
	                result = magic(String.valueOf(result).toCharArray());
	                output = true;
	            } else {
	                output = false;
	                // Check if the single digit is 1
	                if (result == 1) {
	                    System.out.println("Magic number");
	                } else {
	                    System.out.println("Not a magic number");
	                }
	            }
	        } while (output);
	    }
	      
	     
	
	public static int magic(char[] input) {
		int sum=0;
		for(int i=0;i<input.length;i++){
	    	 sum=sum+Integer.parseInt(String.valueOf(input[i]));
	     }
		
		return sum;
	}

}
