class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++){
            max=Math.max(max,nums[i]);
        }
        for(int j = max ; j<max+k ; j++){
            ans+=j;
        }
        return ans;
    }
}