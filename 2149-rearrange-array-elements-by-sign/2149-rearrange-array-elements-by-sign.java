class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int p[] = new int[n];
        // int q[] = new int[n/2];
        int j = 0;
        int k = 0;
        for(int i = 0 ; i<n ; i++){
            if(nums[i]>0){
                p[2*j]=nums[i];
                j++;
            }
            else{
                p[(2*k)+1]=nums[i];
                k++;
            }

        }
        return p;
    }
}