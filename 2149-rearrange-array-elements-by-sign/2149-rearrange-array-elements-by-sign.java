class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int p[] = new int[n/2];
        int q[] = new int[n/2];
        int j = 0;
        int k = 0;
        for(int i = 0 ; i<n ; i++){
            if(nums[i]>0){
                p[j]=nums[i];
                j++;
            }
            else{
                q[k]=nums[i];
                k++;
            }

        }
        int m =0;
        int l =0;
        for(int i = 0 ; i<n ; i++){
            if(i%2==0){
                nums[i]=p[m];
                m++;
            }
            else{
                nums[i]=q[l];
                l++;
            }
        }
        return nums;
    }
}