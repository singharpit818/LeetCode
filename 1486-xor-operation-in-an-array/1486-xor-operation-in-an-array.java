class Solution {
    public int xorOperation(int n, int start) {
        int c = start;
        for(int i = 1 ; i<n ; i++){
            int ans = start+(2*i);
            c=c^ans;
        }
        return c;
    }
}