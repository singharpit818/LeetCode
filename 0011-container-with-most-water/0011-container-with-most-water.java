class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int n = height.length;
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i<j){
            int min = Math.min(height[i],height[j]);
            ans = (j-i)*min;
            max = Math.max(ans,max);
            if(min==height[i])i++;
            else j--;
        }
        return max;
    }
}