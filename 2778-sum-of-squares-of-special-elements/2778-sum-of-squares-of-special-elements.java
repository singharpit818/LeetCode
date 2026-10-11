class Solution {
    public int sumOfSquares(int[] nums) {
        int s = nums.length;
        int sum=0;
        for (int i = 1 ; i<=s ; i++){

            if(s%i==0){
                sum+= nums[i-1]*nums[i-1];
            }
        }
        
        return sum;
    }
}