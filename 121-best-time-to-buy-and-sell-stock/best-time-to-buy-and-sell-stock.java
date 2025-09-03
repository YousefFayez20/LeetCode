class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length == 1){
            return profit;
        }
        int BuyDay = 0;
        int SellDay = 1;
        while(SellDay < prices.length){
            profit = Math.max(profit, prices[SellDay] - prices[BuyDay]);
            if(prices[SellDay] < prices[BuyDay]){
                BuyDay = SellDay;
            } 
            SellDay++;
        }
        return profit;

        
    }
}