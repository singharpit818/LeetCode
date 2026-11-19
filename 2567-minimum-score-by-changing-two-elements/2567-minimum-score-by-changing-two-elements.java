class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = nums[n-1]-nums[2];
        int j = nums[n-3]-nums[0];
        int k = nums[n-2]-nums[1];


        return Math.min(Math.min(m,j),k);
        
    }
}