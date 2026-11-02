class Solution {
    public int minMoves2(int[] nums) {
    //     long min = Long.MAX_VALUE;
    //     for(int i = 0 ; i<nums.length ; i++){
    //     long c = 0;
    //         for(int j = 0 ; j<nums.length ; j++ ){
    //             c+=Math.abs((long)nums[i]-nums[j]);
    //         }
    //         min=Math.min(min,c);
    //     }
    //   return (int)min;  
    int c = 0;
    int n = nums.length;
    Arrays.sort(nums);
    for(int i = 0 ; i<n ; i++){
        c+=Math.abs(nums[n/2]-nums[i]);

    }
    return c;
    }
}