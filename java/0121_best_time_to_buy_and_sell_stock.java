class Solution {

    public int maxProfit(int[] prices) {
              
        /* 
        
        have a variable to track min value
        since we must buy before selling max value will always be updated to current index
        max = current price[i]
        have a variable to track maxProfit
        
        [7,1,5,3,6,4]
        
        min  = 7 1 1 1 1 1
        p[i] = 7 1 5 3 6 4
        maxP  = 0 0 4 2 5 3
        
        */

        int profit = 0;
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }

            if (profit < (prices[i] - min)) {
                profit = (prices[i] - min);
            }

        }

        return profit;

    }
}
