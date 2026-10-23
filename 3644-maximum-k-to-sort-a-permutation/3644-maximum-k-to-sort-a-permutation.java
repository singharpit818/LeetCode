class Solution {
    public int sortPermutation(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n = nums.length;

        for(int i = 0 ; i<n ; i++){
            if(nums[i]!=i )ans&=nums[i];

        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}