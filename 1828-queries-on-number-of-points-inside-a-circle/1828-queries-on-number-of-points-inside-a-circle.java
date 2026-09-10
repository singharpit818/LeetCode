class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int q = queries.length;
        int p = points.length;
        int ans[] = new int [q];
        for(int i = 0 ; i<q ; i++){
            double r = Math.pow(queries[i][2],2);
            for(int j = 0 ; j<p ; j++){
            double v1 = Math.pow((points[j][0]-queries[i][0]),2);
            double v2 = Math.pow((points[j][1]-queries[i][1]),2);
            if((v1+v2)<=r){
                    ans[i]++;
            }
            }
        }
        return ans;
    }
}