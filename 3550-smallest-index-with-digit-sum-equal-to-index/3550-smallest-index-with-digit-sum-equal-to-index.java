class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            int sum = 0;
            int k = nums[i];
            while(k>0){
                int rem = k%10;
                sum+=rem;
                k/=10;
            }
            if(sum==i)return i;
        }
        return -1;
    }
}