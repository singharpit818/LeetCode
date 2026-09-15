class Solution {
    public int maxCoins(int[] piles) {
        int ans  = 0;
        Arrays.sort(piles);
        int n = piles.length;
        int m = n/3;
        int j=0;
        for(int i = n-2 ; i>=m ; i= i-2 ){
            ans+=piles[i];
            j++;
        }
        return ans;
    }
}