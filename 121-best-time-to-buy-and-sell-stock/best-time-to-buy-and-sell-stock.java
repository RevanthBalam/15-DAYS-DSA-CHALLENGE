class Solution {
    public int maxProfit(int[] prices) {
        int buyedDay = prices[0];
        int maxProfit = 0;
        for(int i = 1;i<prices.length;i++){
           maxProfit = Math.max(prices[i]-buyedDay,maxProfit);
           if(prices[i]<buyedDay){
            buyedDay = prices[i];
           }
        }
        return maxProfit;
        
    }
}