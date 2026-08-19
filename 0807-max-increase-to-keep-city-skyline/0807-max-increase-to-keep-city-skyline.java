class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        int k = 0;
        int row[] = new int[n];
        int col[] = new int[n];
        for(int i = 0 ; i<n ; i++){
        int mrow = Integer.MIN_VALUE;
        int mcol = Integer.MIN_VALUE;
            for(int j = 0 ; j<n ; j++){

                mrow=Math.max(mrow,grid[i][j]);
                mcol=Math.max(mcol,grid[j][i]);
            }
            row[i]=mrow;
            col[i]=mcol;
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){

                ans+=grid[i][j]-Math.min(row[i],col[j]);

            }   
        }
        return Math.abs(ans);
    }
}