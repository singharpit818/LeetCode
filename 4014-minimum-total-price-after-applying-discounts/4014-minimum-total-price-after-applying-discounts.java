class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double ans = 0;
        int p = prices.length-1;
        int d = discounts.length-1;
        while(p>=0){

                if(d>=0){
        
                ans+= (double)(prices[p] * ((100-discounts[d])))/100;
                p--;
                d--;
        }
        if(d<0 && p>=0){
            ans+=prices[p];
            p--;
        }
                
        }
        return ans;
    }
}