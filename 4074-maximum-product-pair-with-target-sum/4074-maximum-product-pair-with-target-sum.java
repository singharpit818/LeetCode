class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int max = Integer.MIN_VALUE;
        int f=-1;
        int e=-1;  
        int ans[] = new int[2];
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                if(nums[i]+nums[j]==target && nums[i]>nums[j]){
                    int pro = nums[i]*nums[j];
                        if(pro>max){
                            max=pro;
                        f=i;
                        e=j;
                        }
                }
                
            }
            
        }
        ans[0]=f;
        ans[1]=e;
        return ans;
    }
}