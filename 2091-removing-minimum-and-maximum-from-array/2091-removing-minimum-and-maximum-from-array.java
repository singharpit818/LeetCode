class Solution {
    public int minimumDeletions(int[] nums) {
        int mini = 0;
        int maxi = 0;
        int n = nums.length;
        for(int i=1 ; i<n ; i++){
            if(nums[i]<nums[mini]){
                mini=i;
            }
            if(nums[i]>nums[maxi]){
                maxi=i;
            }

        }
        int left = Math.min(mini,maxi);
        int right = Math.max(mini,maxi);

        int delleft =  right + 1;

        int delright =  n-left;

        int delall =  (left+1)+(n-right);

        return Math.min(delleft,Math.min(delright,delall));

        
    }
}