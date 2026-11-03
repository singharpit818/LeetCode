class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int num : nums){

            max=Math.max(num,max);
        }
        int sum = 0;
        for(int num:nums){
            sum+= max-num;
        }
        return sum;
    }
}