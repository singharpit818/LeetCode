class Solution {
    public int earliestTime(int[][] tasks) {
        int n = tasks.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<n ; i++){
        int ans=0;
            for(int j = 0 ; j<2 ; j++){
                ans+= tasks[i][j];
            }
                min=Math.min(min,ans);
        }
      return min;  
    }
}