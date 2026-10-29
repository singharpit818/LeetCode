class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length ; i++){

            max=Math.max(nums[i],max);
        }
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            int dif = max-nums[i];
            sum+=dif;
        }
        return sum;
    }
}