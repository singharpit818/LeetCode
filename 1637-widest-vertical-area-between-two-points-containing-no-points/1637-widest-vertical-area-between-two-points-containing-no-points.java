class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int max = 0;
        int [] set = new int[n];
        for(int i = 0 ; i<n ; i++){
            set[i]=points[i][0];
        }
        Arrays.sort(set);
        for(int i = 1 ; i<n ; i++){
            // int min = Math.abs(set[i]-set[i+1]);
            max=Math.max(set[i]-set[i-1],max);
        }
        return max;
    }
}