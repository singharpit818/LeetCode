class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[] = new int[n];
        for(int i = n-1 ; i>=0 ; i--){
            min=Math.min(min,nums[i]);
            arr[i]=min;
        }
        for(int j = 0 ; j<n ; j++){
            max=Math.max(max,nums[j]);
            if((max-arr[j])<=k) return j;
        }
        return -1;       
    }
}