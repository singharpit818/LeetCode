class Solution {
    static void swap(int mat[][],int i,int j){
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;

    }
    static void reverse(int mat[]){
        int i = 0 , j=mat.length-1;
        while(i<j){
            int temp = mat[i];
            mat[i]=mat[j];
            mat[j]=temp;
            i++;
            j--;
        }
        
    }
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        for(int i = 0 ; i<n ; i++){
            for(int j =i ; j<n ; j++){
                swap(matrix , i , j);
            }
            reverse(matrix[i]);
        }
        
    }
}