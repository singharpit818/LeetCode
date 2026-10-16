class Solution {
    public int maxProduct(int n) {
        // int max = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        int sum=1;
        while(n!=0){
           int rem=n%10;
            ans.add(rem);
            // max = Math.max(max,sum);
            n/=10;
        }
        Collections.sort(ans, Collections.reverseOrder());
        
        return ans.get(0)*ans.get(1);
    }
}