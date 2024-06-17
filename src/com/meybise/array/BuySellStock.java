package com.meybise.array;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 7, 1, 5, 3, 6, 4 };
//		System.out.println(maxProfit(input));
		System.out.println(maxProfitother(input));
	}

	public static int maxProfit(int[] prices) {
		
		 if (prices == null || prices.length < 2) {
	            return 0; // If there are fewer than 2 prices, no transaction can be made
	        }

		int profit = 0;
		int min = prices[0];
		for (int i = 0; i < prices.length - 1; i++) {

			if (prices[i] < min) {
				min = prices[i];
			}
			int value = prices[i + 1] - min;

			if (value > profit)
				profit = value;

		}
		return profit;

	}
	
	 public static int maxProfitother(int[] prices) {
	        if (prices == null || prices.length < 2) {
	            return 0; // If there are fewer than 2 prices, no transaction can be made
	        }
	        
	        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to a very large value
	        int maxProfit = 0; // Initialize maxProfit to 0
	        
	        for (int i = 0; i < prices.length; i++) {
	            // Update minPrice to the minimum of current minPrice and prices[i]
	            if (prices[i] < minPrice) {
	                minPrice = prices[i];
	            } else {
	                // Calculate potential profit if selling at prices[i]
	                int currentProfit = prices[i] - minPrice;
	                // Update maxProfit if currentProfit is greater
	                if (currentProfit > maxProfit) {
	                    maxProfit = currentProfit;
	                }
	            }
	        }
	        
	        return maxProfit;
	    }

}
