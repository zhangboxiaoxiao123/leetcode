package 买卖股票的最佳时机II;

class Solution {
	int maxProfit(int[] prices) {
        int len=prices.length;
        if(len==0||len==1)
            return 0;
        int profit=0;
        for(int i=1;i<len;i++){
            int sum=prices[i]-prices[i-1];
            if(sum>0)
                profit+=sum;
        }
        return profit;
    }
}