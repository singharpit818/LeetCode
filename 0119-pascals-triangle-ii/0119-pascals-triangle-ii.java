class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i<=rowIndex ; i++){
            List<Integer> val = new ArrayList<>();
            val.add(1);
            for(int j = 1 ; j<i ; j++){
                val.add(ans.get(i-1).get(j-1)
                + ans.get(i-1).get(j));
            }
            if(i>0){
                val.add(1);
            }
            ans.add(val);
        }        
        return ans.get(rowIndex);
    }
}