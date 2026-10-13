class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long pos = 0;
        long neg = 0;
        for(int i = 0 ; i<n ; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
            
            for(int i = 0 ; i < n/2 ; i++){
                neg+=nums[i];
            }
            for(int i = n/2 ; i<n ; i++){
                pos+=nums[i];
            }    
        return pos-neg;

    }   
}