class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        int c[] = new int[1001];
        ArrayList<Integer> ans  = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<nums[i].length; j++){
                c[nums[i][j]]++;


            }
        }
        for(int i = 0 ; i<1001 ; i++){
            if(c[i]==n){
                ans.add(i);
            }
        }
     return ans;   
    }
}