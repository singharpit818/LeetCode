class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int c=0;
        for(int i = 0 ; i<n ; i++){
            int k = nums[i];
            while(k!=0){
                int rem = k%10;
                if(rem==digit){
                    c++;
                }
                k/=10;
            }
        }
      return c;  
    }
}