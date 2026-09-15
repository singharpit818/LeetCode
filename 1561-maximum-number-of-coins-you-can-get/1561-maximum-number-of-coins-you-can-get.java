class Solution {
    public int maxCoins(int[] piles) {
        int ans  = 0;
        Arrays.sort(piles);
        int n = piles.length;
        int j=0;
        for(int i = n-2 ; i>j ; i= i-2 ){
            ans+=piles[i];
            j++;
        }
        return ans;
    }
}