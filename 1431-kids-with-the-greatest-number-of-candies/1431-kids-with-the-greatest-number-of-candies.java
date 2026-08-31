class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ec) {
        int max = Integer.MIN_VALUE;
        int n = candies.length;
        ArrayList<Boolean> s = new ArrayList<>(n); 
        for(int i = 0 ; i<n ; i++){
            max=Math.max(candies[i],max);
        }
        for(int i = 0 ; i<n ; i++){
            if((candies[i]+ec)>=max){
                s.add(true);
            }
            else s.add(false);
        }
        return s;
    }
}