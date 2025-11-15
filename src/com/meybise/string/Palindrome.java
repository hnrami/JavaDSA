package com.meybise.string;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (palindrome("1241"))
			System.out.println("Input is palindrome ");
		else
			System.out.println("Input is not palindrome ");
		
		System.out.println(reverse("hemang"));

	}

	public static boolean palindrome(String input) {

		if (input != null & input.length() > 2) {

			char[] charArray = input.toCharArray();
			int start = 0;
			int end = charArray.length - 1;

			while (start < end) {

				if (charArray[start] != charArray[end])
					return false;

				start++;
				end--;

			}
			return true;

		} else {

			return false;
		}

	}
	
	public static String reverse(String input) {

		if (input != null & input.length() >= 2) {

			char[] charArray = input.toCharArray();
			int left = 0;
			int right = charArray.length - 1;

			 while (left < right) {
		            // Swap the characters
		            char temp = charArray[left];
		            charArray[left] = charArray[right];
		            charArray[right] = temp;

		            // Move towards the center
		            left++;
		            right--;
		        }
			 
			 return String.valueOf(charArray);
			
			

		} else {

			return input;
		}

	}


}
