class Solution {
    public int[][] generateMatrix(int n) {
    
    int mat[][]=new int[n][n];



        int tr=0 , br=n-1 , lc= 0 , rc = n-1 , te = 1, k=1;

        while(te<=(n*n)){

            for(int j = lc ; j<=rc && te<= n*n; j++){
                mat[tr][j]=k++;
                // System.out.print(mat[tr][j] + " ");
                te++;
                
            }
            tr++;

            for(int i = tr ; i<=br && te<= n*n ; i++){
                mat[i][rc]=k++;
                // System.out.print(mat[i][rc] + " ");
                
            te++;
            }
            rc--;

            for(int j = rc ; j>=lc && te<= n*n ; j--){
                mat[br][j]=k++;
                // System.out.print(mat[br][j] + " ");
                
            te++;
            }
            br--;

            for(int i = br ; i>=tr && te<= n*n ; i--){
                mat[i][lc]=k++;
                // System.out.print(mat[i][lc] + " ");
                
            te++;
            }
            lc++;

        }
        return mat;
        
    }
}