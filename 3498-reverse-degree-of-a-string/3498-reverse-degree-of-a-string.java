class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0 ; i<n ; i++){
            int val = ('z'- s.charAt(i) + 1)*(i+1) ;
            ans+=val;
        }
        return ans;
    }
}