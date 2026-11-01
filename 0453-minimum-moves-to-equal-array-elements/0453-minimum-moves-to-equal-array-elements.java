class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            min=Math.min(nums[i],min);
        }
        for(int i = 0 ; i<nums.length ; i++){
            int d = nums[i]-min;
            sum+=d;
        }
        return sum;
        
    }
}