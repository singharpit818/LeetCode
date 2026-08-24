class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c1 = 0;
        int c2 = 0;
        int n = nums1.length;
        int m = nums2.length;

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                if(nums1[i]==nums2[j]){
                    c1++;
                    break;
                }
            }
        }
        
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(nums1[j]==nums2[i]){
                    c2++;
                    break;
                }
            }
        }
        int ans[]= new int[2];
        ans[0]=c1;
        ans[1]=c2;
        return ans;
    }
}