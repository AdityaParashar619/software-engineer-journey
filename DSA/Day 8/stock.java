class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        int profit=0;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            int currPrice=prices[i];
            min=Math.min(min,currPrice);
            profit=currPrice-min;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}
// Input: prices = [7,1,5,3,6,4]
// Output: 5