package com.meybise.array;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 7,12,2,9,4,5,65,7 };
//		System.out.println(maxProfit(input));
		System.out.println(maxprofitown(input));
//		fixminmxnumber(input);
	}

public static int maxprofitown(int [] price) {
	
	
	int profit=0;
	
	for (int i = 0; i < price.length - 1; i++) {
	    for (int j = i + 1; j < price.length; j++) {  // Changed i to j in the loop condition
	        int sum = price[j] - price[i];
	        if (profit < sum)
	            profit = sum;
	    }
	}
//	int min=price[0];
//	
//	
//	for(int i=0;i<price.length-1;i++) {
//		
//		if(min>price[i]) {
//			min=price[i];
//			
//		}
//		
//		int value = price[i]-min;
//		
//		if(value>profit) {
//			profit=value;
//		}
//		
//		
//	}
	
	return profit;
}
	
public static void  fixminmxnumber(int[] prices) {
		
		
		int max=prices[0];
		int min=prices[0];
		
		for(int i=0;i<prices.length-1;i++) {
			
			if(min > prices[i]) {
				min=prices[i];
			}
			if(max < prices[i]) {
				max=prices[i];
			}
			
		}
		
		System.out.println("MAX"+max);
		System.out.println("MIN"+min);
		
	}

	public static int maxprofitrevise(int[] prices) {
		
		
		int profit=0;
		int min=prices[0];
		
		for(int i=0;i<prices.length-1;i++) {
			
			if(prices[i]<min) {
				min=prices[i];
			}
			
			int value = prices[i-1] - min ;
			
			if(value>profit) {
				profit=value;
			}
			
		}
		
		return profit;
		
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
